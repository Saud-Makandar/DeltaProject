use startersql;
Create Table user_log(
	id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT ,
    name varchar(100),
    created_on Timestamp Default Current_Timestamp
);
 
 Delimiter $$
 
 CREATE Trigger AUI 
 After Insert on users
 For each row
 Begin
	Insert into user_log(user_id,name)
    values(new.id,new.name);
End $$

Delimiter ;

insert into users(name,email,gender,date_of_birth,salary) values
('Mohan','Mohan@example.com','Male','2008-08-16',50000),
('Sohan','Sohan@example.com','Male','2008-04-6',65000),
('Maria','Maria@example.com','Female','2004-04-26',65000);

Select * from user_log;