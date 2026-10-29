Create Database Evalute;
Use Evalute;
CREATE TABLE users (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    city VARCHAR(100) NOT NULL
);
CREATE TABLE products (
    product_id INT AUTO_INCREMENT PRIMARY KEY,
    product_name VARCHAR(100) NOT NULL,
    category VARCHAR(100)
);
CREATE TABLE orders (
    order_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT,
    order_date DATE NOT NULL,
    total_amount INT,
    FOREIGN KEY (user_id) REFERENCES users(user_id) ON DELETE CASCADE
);
CREATE TABLE order_items (
    order_item_id INT AUTO_INCREMENT PRIMARY KEY,
    order_id INT,
    product_id INT,
    quantity INT NOT NULL,
    price INT,
    FOREIGN KEY (order_id) REFERENCES orders(order_id) ON DELETE CASCADE,
    FOREIGN KEY (product_id) REFERENCES products(product_id) ON DELETE CASCADE
);
INSERT INTO users (user_id, name, city) VALUES
(1, 'Amit', 'Mumbai'),
(2, 'Rahul', 'Delhi'),
(3, 'Sneha', 'Mumbai'),
(4, 'Priya', 'Bangalore'),
(5, 'Arjun', 'Delhi'),
(6, 'Neha', 'Mumbai');
INSERT INTO products (product_id, product_name, category) VALUES
(101, 'Laptop', 'Electronics'),
(102, 'Phone', 'Electronics'),
(103, 'Shoes', 'Fashion'),
(104, 'Watch', 'Accessories'),
(105, 'Headphones', 'Electronics');
INSERT INTO orders (order_id, user_id, order_date, total_amount) VALUES
(1001, 1, '2024-01-10', 50000),
(1002, 2, '2024-01-11', 20000),
(1003, 1, '2024-01-15', 15000),
(1004, 3, '2024-01-20', 30000),
(1005, 4, '2024-01-25', 25000),
(1006, 5, '2024-01-28', 10000),
(1007, 6, '2024-02-01', 40000),
(1008, 3, '2024-02-05', 12000);

