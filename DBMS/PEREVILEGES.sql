
-- 1. Create and select database
CREATE DATABASE IF NOT EXISTS PrivilegesDB;
USE PrivilegesDB;

-- 2. Create Student table
CREATE TABLE Student (
    S_ID INT PRIMARY KEY,
    S_NAME VARCHAR(50),
    DEPARTMENT VARCHAR(50)
);

-- 3. Create Course table
CREATE TABLE Course (
    C_ID INT PRIMARY KEY,
    C_NAME VARCHAR(50),
    CREDITS INT
);

-- 4. Insert sample data
INSERT INTO Student VALUES
(1, 'Saud', 'IT'),
(2, 'Sarah', 'IT'),
(3, 'Nemi', 'Computer');

INSERT INTO Course VALUES
(101, 'DBMS', 4),
(102, 'DSA', 3),
(103, 'OS', 4);

-- 5. Create database users
CREATE USER 'Faculty'@'localhost'
IDENTIFIED BY 'Faculty123';

CREATE USER 'Student_USER'@'localhost'
IDENTIFIED BY 'STD123';

-- 6. Grant privileges to Faculty
GRANT SELECT, INSERT, UPDATE
ON PrivilegesDB.*
TO 'Faculty'@'localhost';

-- 7. Grant limited privileges to Student
GRANT SELECT
ON PrivilegesDB.*
TO 'Student_USER'@'localhost';

-- 8. Display privileges
SHOW GRANTS FOR 'Faculty'@'localhost';
SHOW GRANTS FOR 'Student_USER'@'localhost';

-- 9. Verify tables and data
SHOW TABLES;
SELECT * FROM Student;
SELECT * FROM Course;

GRANT SELECT
ON PrivilegesDB.Course
TO 'Faculty'@'localhost'
WITH GRANT OPTION;

-- Remove the broad permissions
REVOKE SELECT, INSERT, UPDATE
ON PrivilegesDB.*
FROM 'Faculty'@'localhost';

REVOKE SELECT, INSERT, UPDATE
ON PrivilegesDB.*
FROM 'Faculty'@'localhost';

GRANT SELECT, INSERT, UPDATE
ON PrivilegesDB.Course
TO 'Faculty'@'localhost';

SHOW GRANTS FOR 'Faculty'@'localhost';

REVOKE ALL PRIVILEGES, GRANT OPTION
FROM 'Faculty'@'localhost';

GRANT SELECT, INSERT, UPDATE
ON PrivilegesDB.Course
TO 'Faculty'@'localhost';

SHOW GRANTS FOR 'Faculty'@'localhost';
