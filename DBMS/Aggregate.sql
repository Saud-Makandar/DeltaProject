use startersql;
SELECT COUNT(*) From users;

SELECT COUNT(*) From users WHERE gender ='Female';
SELECT * from users where gender='Female';
SELECT  MIN(salary) AS min_Salary,
MAX(salary) AS max_Salary
From users;

SELECT sum(SALARY)AS total_Assets From users;