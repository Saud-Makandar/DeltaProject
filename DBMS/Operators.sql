Create database CollegeWallah;
use CollegeWallah;

Create table student (
	std_id int AUTO_INCREMENT primary key,
    std_name Varchar(50) Not Null,
    std_Dept Varchar(50) Not Null
);

Create table course (
	C_id int AUTO_INCREMENT primary key,
    C_name Varchar(50) Not Null unique
);
Create table Enrollment(
    std_id INT,
    c_id INT,
    PRIMARY KEY (std_id, c_id),
    FOREIGN KEY (std_id) REFERENCES student(std_id) on delete cascade,
    FOREIGN KEY (c_id) REFERENCES course(c_id) on delete cascade
);
insert into student values
(null,' Saud ',' IT '),
(null,' Nemi ',' AI '),
(null,' Sumit ',' CSE '),
(null,' Sarah ',' IT '),
(null,' Vadashree',' Mech '),
(null,' Bidishah ',' ECS '),
(null,' Crisha ',' ECS ');

insert into course values
(null , 'DBMS'),
(null , 'A O T'),
(null , 'Field Project'),
(null , 'Image PRocessing'),
(null , 'Sampling and Optimization');

Truncate table enrollment;

Start transaction ;
insert into Enrollment values 
(1,1),
(1,2);
savepoint p1 ;
insert into Enrollment values 
(2,1),
(2,2);
savepoint p2 ;
insert into Enrollment values 
(3,1),
(3,2);
savepoint p3 ;
insert into Enrollment values 
(4,1),
(4,2);

rollback to p2;

commit;

