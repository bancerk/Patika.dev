CREATE TABLE <table_name> (
<column_name> <data_type> <constraint>,
...
<column_name> <data_type> <constraint>;
);

CREATE TABLE author(
    id SERIAL PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(100),
    birthday DATE
);

SELECT * FROM author;
INSERT INTO author(id,first_name,last_name,email,birthday) -- does not need to be in the same sequence as the table columns, but data entry should be done with the sequence this line dictates later on
-- id does not need to be put in because it is serial type, it's provided automatically
VALUES
('Haruki','Murakami','haruki@murakami.com','1948-11-07'),
('Sabahattin','Ali','sabahattin@ali.com','1914-07-11'),
('Orhan','Pamuk','orhan@pamuk.com','1950-04-14'),
('Halide Edip','Adıvar','halide@edip.com','1884-07-11'),
('Zygmunt','Bauman','zygmunt@ali.com','1911-07-12');

CREATE TABLE author2(LIKE author); -- copy column format to author2 but data is empty
INSERT INTO author2 SELECT * FROM author; -- copy all data from author table into author2
INSERT INTO author2 SELECT * FROM author WHERE first_name='Sabahattin'; -- copy only Sabahattin from author table to author2
CREATE TABLE author3 AS SELECT * FROM author; -- copy column format WITH data to author3

DROP TABLE author4; -- deletes author 4 table
DROP TABLE IF EXISTS author4;