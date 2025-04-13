-- CHECK
SELECT * FROM users;
INSERT INTO users(username,email,age) VALUES ('gamer3','gamer3@gmail.com',-22);

ALTER TABLE users ADD CHECK(age>18); -- ERROR:  check constraint "users_age_check" of relation "users" is violated by some row
DELETE FROM users WHERE id=8;
ALTER TABLE users ADD CHECK(age>18);
INSERT INTO users(username,email,age) VALUES ('gamer3','gamer3@gmail.com',-22); -- ERROR:  new row for relation "users" violates check constraint "users_age_check" Failing row contains (9, gamer3, gamer3@gmail.com, -22).
INSERT INTO users(username,email,age) VALUES ('gamer4','gamer4@gmail.com',27);

CREATE TABLE products (
	product_no integer,
	name text,
	price numeric CHECK (price>0),
	discounted_price numeric CHECK (discounted_price>0),
	CHECK (price > discounted_price)
);

INSERT INTO products(product_no,name,price,discounted_price)
VALUES
	(1,'test_product',10,12); -- ERROR:  new row for relation "products" violates check constraint "products_check" Failing row contains (1, test_product, 10, 12).

INSERT INTO products(product_no,name,price,discounted_price)
VALUES
	(1,'test_product',-10,12); -- ERROR:  new row for relation "products" violates check constraint "products_check" Failing row contains (1, test_product, -10, 12).

INSERT INTO products(product_no,name,price,discounted_price)
VALUES
	(1,'test_product',12,10);
SELECT * FROM products;