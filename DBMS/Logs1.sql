CREATE DATABASE recovery_database;

USE recovery_database;

SET AUTOCOMMIT = 0;

CREATE TABLE accounts (
    account_id INT PRIMARY KEY,
    name VARCHAR(50),
    balance INT
);

INSERT INTO accounts VALUES
(1, 'Alice', 1000),
(2, 'Bob', 1500);

COMMIT;

SELECT * FROM accounts;

