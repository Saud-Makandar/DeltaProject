
CREATE DATABASE IF NOT EXISTS IT_DB;
CREATE DATABASE IF NOT EXISTS EXTC_DB;
CREATE DATABASE IF NOT EXISTS MECH_DB;
CREATE DATABASE IF NOT EXISTS ELEC_DB;

SHOW DATABASES;


USE IT_DB;

CREATE TABLE Student (
    Student_ID INT PRIMARY KEY,
    Student_Name VARCHAR(50),
    Department VARCHAR(30),
    Year INT,
    Email VARCHAR(100),
    CGPA DECIMAL(3,2)
);


USE EXTC_DB;

CREATE TABLE Student (
    Student_ID INT PRIMARY KEY,
    Student_Name VARCHAR(50),
    Department VARCHAR(30),
    Year INT,
    Email VARCHAR(100),
    CGPA DECIMAL(3,2)
);

USE MECH_DB;

CREATE TABLE Student (
    Student_ID INT PRIMARY KEY,
    Student_Name VARCHAR(50),
    Department VARCHAR(30),
    Year INT,
    Email VARCHAR(100),
    CGPA DECIMAL(3,2)
);


USE ELEC_DB;

CREATE TABLE Student (
    Student_ID INT PRIMARY KEY,
    Student_Name VARCHAR(50),
    Department VARCHAR(30),
    Year INT,
    Email VARCHAR(100),
    CGPA DECIMAL(3,2)
);


USE IT_DB;

INSERT INTO Student VALUES
(1, 'Saud', 'IT', 3, 'saud@example.com', 9.10),
(2, 'Sarah', 'IT', 3, 'sarah@example.com', 8.80),
(3, 'Rehaan', 'IT', 3, 'rehaan@example.com', 8.40);


USE EXTC_DB;

INSERT INTO Student VALUES
(4, 'Aarav', 'EXTC', 3, 'aarav@example.com', 9.00),
(5, 'Neha', 'EXTC', 3, 'neha@example.com', 8.60),
(6, 'Riya', 'EXTC', 3, 'riya@example.com', 8.20);


USE MECH_DB;

INSERT INTO Student VALUES
(7, 'Sumit', 'MECH', 3, 'sumit@example.com', 8.90),
(8, 'Rahul', 'MECH', 3, 'rahul@example.com', 8.30),
(9, 'Aman', 'MECH', 3, 'aman@example.com', 7.90);


USE ELEC_DB;

INSERT INTO Student VALUES
(10, 'Priya', 'ELEC', 3, 'priya@example.com', 9.20),
(11, 'Anaya', 'ELEC', 3, 'anaya@example.com', 8.70),
(12, 'Karan', 'ELEC', 3, 'karan@example.com', 8.10);


SELECT * FROM IT_DB.Student;
SELECT * FROM EXTC_DB.Student;
SELECT * FROM MECH_DB.Student;
SELECT * FROM ELEC_DB.Student;


CREATE DATABASE IF NOT EXISTS GLOBAL_DB;

USE GLOBAL_DB;


USE GLOBAL_DB;

CREATE OR REPLACE VIEW Global_Student AS
SELECT * FROM IT_DB.Student
UNION ALL
SELECT * FROM EXTC_DB.Student
UNION ALL
SELECT * FROM MECH_DB.Student
UNION ALL
SELECT * FROM ELEC_DB.Student;


SELECT * FROM GLOBAL_DB.Global_Student;


SELECT *
FROM GLOBAL_DB.Global_Student
WHERE CGPA > 8.5;


SELECT AVG(CGPA) AS Overall_Average_CGPA
FROM GLOBAL_DB.Global_Student;


SELECT Department,
AVG(CGPA) AS Average_CGPA
FROM GLOBAL_DB.Global_Student
GROUP BY Department;



SELECT * FROM IT_DB.Student
UNION ALL
SELECT * FROM EXTC_DB.Student
UNION ALL
SELECT * FROM MECH_DB.Student
UNION ALL
SELECT * FROM ELEC_DB.Student;



SELECT * FROM IT_DB.Student
UNION ALL
SELECT * FROM EXTC_DB.Student
UNION ALL
SELECT * FROM MECH_DB.Student;
