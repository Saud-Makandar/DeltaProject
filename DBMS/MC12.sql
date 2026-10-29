
USE ADMT;

SET autocommit = 0;

SELECT @@autocommit;


START TRANSACTION;

UPDATE employee
SET salary = 38000
WHERE emp_id = 1;

COMMIT;
START TRANSACTION;

UPDATE employee
SET salary = 42000
WHERE emp_id = 1;
COMMIT;