Create Database sfit;
use sfit;

CREATE TABLE Student (
	std_id INT Auto_Increment Primary Key,
    name VARCHAR(100) Not Null,
    dept VARCHAR(100) Not Null,
    email VARCHAR(100) Not Null Unique
);
Insert Into Student(name,dept,email)values
('Saud Makandar','INFT','saud@example.com'),
('Nemi Doshi','Mech','Nemi@example.com'),
('Sumit BhendiGeri','Inft','sumit@example.com'),
('Sarah M','Comps','sarah@example.com'),
('Bisdisha M','INFT','bidi@example.com'),
('Vedashri Chaudary','Aiml','vedeshri@example.com'),
('Crisha D','Mech','crisha@example.com');

select * from Student;

Create Table Book_shelf(
	Book_id INT Auto_Increment Primary Key ,
    title VARCHAR(100) unique Not Null,
    author VARCHAR(100) Not Null,
    price  VARCHAR(100) Not Null
    )Auto_Increment=101;
INSERT INTO Book_shelf (title, author, price)
VALUES
('To Kill a Mockingbird', 'Harper Lee', '450'),
('1984', 'George Orwell', '399'),
('Pride and Prejudice', 'Jane Austen', '350'),
('The Great Gatsby', 'F. Scott Fitzgerald', '420'),
('Moby-Dick', 'Herman Melville', '500');

Create Table issued (
issue_id INT PRIMARY KEY,
std_id INT NOT NULL,
book_id INT NOT NULL,
issue_date DATE NOT NULL,
return_date DATE,
FOREIGN KEY (std_id) REFERENCES STUDENT(std_id) on delete cascade,
FOREIGN KEY (book_id) REFERENCES BooK_shelf(book_id)on delete cascade
);
INSERT INTO issued (issue_id, std_id, book_id, issue_date, return_date)
VALUES
(1, 1, 101, '2026-04-01', '2026-04-10'),
(2, 2, 102, '2026-04-02', '2026-04-12'),
(3, 3, 103, '2026-04-03', NULL),   -- still issued, not yet returned
(4, 1, 104, '2026-04-05', '2026-04-15'),
(5, 2, 105, '2026-04-06', NULL);   -- still issued

Update Book_shelf
set  price = 1000
where Book_id=103;

Select*from issued
where return_date is Null ;

Select Avg(Price) As Avg_bookPrice
from Book_shelf;

CREATE USER 'saud'@'localhost' IDENTIFIED BY '12345678';

Grant Select,Insert,Delete,update
On sfit.*
To 'saud'@'localhost';

SHOW GRANTS FOR 'saud'@'localhost';

Revoke Delete
on sfit.*
From 'saud'@'localhost';
REVOKE INSERT ON sfit.* FROM 'saud'@'localhost';
FLUSH PRIVILEGES;
REVOKE INSERT ON *.* FROM 'saud'@'localhost';
REVOKE ALL PRIVILEGES, GRANT OPTION FROM 'saud'@'localhost';
SHOW GRANTS FOR 'saud'@'localhost';

Select Count(*)As No_of_Book 
from issued 
where return_date Is Null;

Create View Book_Preview As
select name,title
from Student 
inner Join Book_shelf ;

select *from Book_Preview;

DELIMITER $$
CREATE TRIGGER trg_decrease_stock
AFTER INSERT ON ISSUED
FOR EACH ROW
BEGIN
UPDATE BOOK
SET stock = stock - 1
WHERE book_id = NEW.book_id;
END$$
DELIMITER ;
Create Table Book(
 Stock int ,
 booK_id Int Primary Key ,
 foreign key (book_id) references Book_Shelf(Book_id)on delete cascade
);

SELECT * FROM Book WHERE book_id = 101;
INSERT INTO issued (issue_id, std_id, book_id, issue_date)
VALUES (6, 1, 101, '2026-04-15');
CREATE VIEW student_book_view AS
SELECT S.name, B.title
FROM Student S
JOIN issued I ON S.std_id = I.std_id
JOIN Book_shelf B ON I.book_id = B.book_id;

select *from student_book_view;