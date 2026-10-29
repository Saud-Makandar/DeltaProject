use sfit;
CREATE TABLE Customer (
    cust_id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    city VARCHAR(100) NOT NULL
);
CREATE TABLE Account (
    acc_no INT PRIMARY KEY,
    type VARCHAR(50) NOT NULL,
    balance DECIMAL(10,2) NOT NULL,
    cust_id INT,
    FOREIGN KEY (cust_id) REFERENCES Customer(cust_id)on delete cascade
);
CREATE TABLE Transactions (
    txn_id INT PRIMARY KEY,
    acc_no INT,
    amount DECIMAL(10,2),
    type VARCHAR(50),
    FOREIGN KEY (acc_no) REFERENCES Account(acc_no)
);
INSERT INTO Customer VALUES
(1, 'Amit Shah', 'Mumbai'),
(2, 'Neha Verma', 'Delhi'),
(3, 'Rohit Patil', 'Pune'),
(4, 'Sneha Iyer', 'Chennai'),
(5, 'Arjun Mehta', 'Ahmedabad');

INSERT INTO Account VALUES
(101, 'Savings', 5000.00, 1),
(102, 'Current', 12000.00, 2),
(103, 'Savings', 8000.00, 3),
(104, 'Savings', 15000.00, 4),
(105, 'Current', 7000.00, 5);

INSERT INTO Transactions VALUES
(1, 101, 2000.00, 'Deposit'),
(2, 101, 500.00, 'Withdrawal'),
(3, 102, 3000.00, 'Deposit'),
(4, 103, 1000.00, 'Withdrawal'),
(5, 104, 4000.00, 'Deposit'),
(6, 105, 2000.00, 'Withdrawal');

ALTER TABLE Transactions
MODIFY type ENUM('Deposit','Withdrawal');

Select name , balance
from Customer 
Inner join Account
On  Customer.cust_id = Account.cust_id
where balance >8000;

Select sum(balance)As Balance,type
from account 
Group By type;

Delimiter $$

Create trigger verify
before insert on Transactions
for each row
Begin
Declare current_balance Decimal(10,2);
Select balance into current_balance
from account 
where acc_no=New.acc_no;

IF New.type='Withdrawal'And(current_balance-New.amount<1000)then
Signal Sqlstate '45000'
set MESSAGE_TEXT='Failure ';
End if ;
End  $$
Delimiter ;
INSERT INTO Transactions (txn_id, acc_no, amount, type)
VALUES (10, 101, 4500, 'Withdrawal');

Select name, balance
from customer 
inner join account 
On customer.cust_id=account.cust_id
where balance>6000;

Select type,sum(balance) As Acc_balance
from account
Group by type;

Delimiter $$

Create Procedure deposit(
p_acc_no 
    
    