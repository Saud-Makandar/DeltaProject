CREATE DATABASE IF NOT EXISTS ADMT;
USE ADMT;

CREATE TABLE IF NOT EXISTS employee (
    emp_id INT PRIMARY KEY,
    name VARCHAR(50),
    salary INT
);

DELETE FROM employee;

INSERT INTO employee VALUES
(1, 'Amit', 30000),
(2, 'Neha', 40000),
(3, 'Rahul', 35000);

SELECT * FROM employee;

set autocommit=0;
SELECT @@autocommit;


START TRANSACTION;

UPDATE employee
SET salary = 35000
WHERE emp_id = 1;

commit;

START TRANSACTION;

SELECT *
FROM employee
WHERE emp_id = 1
FOR SHARE;
COMMIT;

SELECT
    ENGINE_TRANSACTION_ID,
    OBJECT_SCHEMA,
    OBJECT_NAME,
    LOCK_TYPE,
    LOCK_MODE,
    LOCK_STATUS
FROM performance_schema.data_locks;

SELECT *
FROM performance_schema.data_lock_waits;