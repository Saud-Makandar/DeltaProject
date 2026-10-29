-- & "c:\Program Files\MySQL\MySQL Server 8.0\bin\mysql.exe" -u root -p

CREATE TABLE USERX(
    id VARCHAR(50) Primary Key,
    username VARCHAR(50)NOT NULL,
    email VARCHAR(50)UNIQUE NOT NULL,
    password VARCHAR(50)UNIQUE NOT NULL
);