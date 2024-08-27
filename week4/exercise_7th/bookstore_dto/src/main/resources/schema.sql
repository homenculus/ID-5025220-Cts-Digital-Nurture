
CREATE TABLE books (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    author VARCHAR(255) NOT NULL,
    published_date DATE,
    price DECIMAL(10, 2)
);


CREATE TABLE customers (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL,
    registration_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO books (title, author, published_date, price) VALUES
('The Great Gatsby', 'F. Scott Fitzgerald', '1925-04-10', 10.99),
('1984', 'George Orwell', '1949-06-08', 8.99),
('To Kill a Mockingbird', 'Harper Lee', '1960-07-11', 12.99);


INSERT INTO customers (name, email) VALUES
('Alice Smith', 'alice.smith@example.com'),
('Bob Johnson', 'bob.johnson@example.com'),
('Charlie Brown', 'charlie.brown@example.com');
