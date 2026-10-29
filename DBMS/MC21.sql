CREATE DATABASE IF NOT EXISTS MC21;
USE MC21;

SET AUTOCOMMIT=0;
SELECT @@AUTOCOMMIT;

CREATE TABLE DataItems (
    Item CHAR(1) PRIMARY KEY,
    Value INT,
    RTS INT,
    WTS INT
);
Create Table Transactions(
	TID varchar(50) Primary Key,
    TS int,
    status varchar(20)
    );
    
INSERT INTO DataItems VALUES
('A', 100, 0, 0),
('B', 200, 0, 0);

INSERT INTO Transactions VALUES
('T1', 5, 'Active'),
('T2', 10, 'Active'),
('T3', 7, 'Active');

DELIMITER //

CREATE PROCEDURE Read_items(
	IN p_tid VARCHAR(50),
    IN p_item CHAR(1)
    )
BEGIN
	DECLARE v_ts INT;
    DECLARE v_rts INT;
    DECLARE v_wts INT;
    DECLARE v_val INT;
    
    SELECT TS into v_ts
    From Transactions
    where TID=p_tid;
    
	SELECT RTS, WTS, Value
    INTO v_rts, v_wts, v_val
    FROM DataItems
    WHERE Item = p_item;
    
    if v_ts < v_wts THEN
		UPDATE TRANSACTIONS
        SET STATUS='ABORTED'
        where TID=p_tid;
        
        Select 'Read_Aborted' AS RESULT;
	else
		update DataITems
        set RTS=greatest(RTS,v_ts)
        WHERE Item = p_item;
		SELECT 'READ ALLOWED' AS Result,
               v_val AS Current_Value;
    END IF;
END //

DELIMITER ;

DROP PROCEDURE IF EXISTS Read_items;

