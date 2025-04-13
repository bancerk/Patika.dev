-- UNIQUE
SELECT * FROM users;
INSERT INTO users(username,email,age)
VALUES
('tester2','tester@gmail.com',44);

CREATE TABLE users(
id SERIAL PRIMARY KEY,
username VARCHAR(20) NOT NULL,
email VARCHAR(50) UNIQUE,
age INTEGER
); -- table already exists error

ALTER TABLE users ADD UNIQUE(email); -- ERROR:  could not create unique index "users_email_key" Key (email)=(tester@gmail.com) is duplicated.
-- changed to tester2@gmail.com from pgadmin interface and saved data changes
ALTER TABLE users ADD UNIQUE(email);

INSERT INTO users(username,email,age)
VALUES
('tester2','tester@gmail.com',44); -- ERROR:  duplicate key value violates unique constraint "users_email_key" Key (email)=(tester@gmail.com) already exists.

INSERT INTO users(username,email,age)
VALUES
('tester3','tester3@gmail.com',55);