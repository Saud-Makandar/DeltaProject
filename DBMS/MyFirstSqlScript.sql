	CREATE DATABASE Delta;
    USE delta;
    CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    gender ENUM('MALE','FEMALE','Other'),
    date_of_Birth DATE,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
    );
    SELECT * FROM users;
    SELECT id,email FROM users;
    RENAME TABLE users TO Programmers;
    ALTER TABLE users ADD is_active BOOLEAN DEFAULT True;
    ALTER TABLE users DROP is_active ;
    ALTER TABLE  users MODIFY name VARCHAR(150);
    SELECT * FROM users;
	ALTER TABLE  users MODIFY email varchar(100) AFTER id;
    INSERT INTO users VALUES
	(1, 'makandarsaud@gmail.com', 'SAUD MAKANDAR', 'MALE', '2005-08-17', DEFAULT);
INSERT INTO users (email, name, gender, date_of_Birth, created_at)VALUES 
('nemi@example.com', 'Nemi', 'FEMALE', '2002-05-12', DEFAULT),

('sumit@example.com', 'Sumit', 'MALE', '2001-11-23', DEFAULT),

('vedsashri@example.com', 'Vedsashri', 'FEMALE', '2003-07-08', DEFAULT),

('sarah@example.com', 'Sarah', 'FEMALE', '2000-03-15', DEFAULT),

('bidishah@example.com', 'Bidishah', 'FEMALE', '2004-09-30', DEFAULT),

('crisha@example.com', 'Crisha', 'FEMALE', '2005-01-25', DEFAULT);
UPDATE users
SET gender = 'MALE'
WHERE email = 'nemi@example.com';
