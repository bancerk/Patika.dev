CREATE TABLE customers (
                           customer_id SERIAL PRIMARY KEY,
                           customer_name VARCHAR(100) NOT NULL,
                           customer_mail VARCHAR(255) UNIQUE NOT NULL,
                           customer_on_date DATE,
                           customer_gender VARCHAR(10) CHECK (customer_gender IN ('MALE', 'FEMALE'))
);