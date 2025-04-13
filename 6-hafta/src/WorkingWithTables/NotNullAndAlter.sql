-- ALTER
CREATE TABLE users(
id SERIAL PRIMARY KEY,
username VARCHAR(20),
email VARCHAR(50),
age INTEGER
);

SELECT * FROM users;

INSERT INTO users(username,email,age)
VALUES
	('tester','tester@gmail.com',23);

INSERT INTO users(email,age)
VALUES
	('gamer@gmail.com',35);

CREATE TABLE users(
id SERIAL PRIMARY KEY,
username VARCHAR(20) NOT NULL,
email VARCHAR(50),
age INTEGER
); -- table already exists error

ALTER TABLE users
ALTER COLUMN username
SET NOT NULL; -- error, null data exists

DELETE FROM users WHERE username=NULL; -- output: DELETE 0 means deletion is not done (syntax error)
DELETE FROM users WHERE username IS NULL RETURNING *;
ALTER TABLE users ALTER COLUMN username SET NOT NULL;
SELECT * FROM users; -- username is now set to NOT NULL

-- NOT NULL
INSERT INTO users(username,email,age)
VALUES
	('','gamer@gmail.com',35); -- empty string variables are not null