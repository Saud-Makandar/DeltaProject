Create DataBase Dbms_Mock;
Use Dbms_Mock;

Create Table Student(
	id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    age INT DEFAULT 20,
    course VARCHAR(150) Not Null
);
CREATE TABLE Book_shelf (
    Book_id INT PRIMARY KEY,
    title VARCHAR(100),
    author VARCHAR(100)
);

Select * From Student;

INSERT INTO Book_shelf (Book_id, title, author)
VALUES
(1, 'Atomic Habits', 'James Clear'),
(2, 'Rich Dad Poor Dad', 'Robert T. Kiyosaki'),
(3, 'The 48 Laws of Power', 'Robert Greene'),
(4, 'The 7 Habits of Highly Effective People', 'Stephen R. Covey'),
(5, 'The Psychology of Money', 'Morgan Housel');

CREATE TABLE book_issued (
    issue_id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT,
    book_id INT,
    issue_date DATE NOT NULL,
    return_date DATE,
    status VARCHAR(20) DEFAULT 'not_issued',
    FOREIGN KEY (user_id) REFERENCES Student(id) On Delete Cascade,
    FOREIGN KEY (book_id) REFERENCES Book_shelf(Book_id)ON DELETE CASCADE
);
INSERT INTO book_issued (user_id, book_id, issue_date, return_date, status)
VALUES
(1, 1, '2026-04-14', '2026-04-28', 'issued'),
(2, 2, '2026-04-14', NULL, 'issued'),
(3, 3, '2026-04-13', '2026-04-20', 'returned'),
(4, 5, '2026-04-14', NULL,'issued');

Delete From Student
where id = 4;

Drop Table Book_issued;
Select *From Book_issued 
Where status ='issued';