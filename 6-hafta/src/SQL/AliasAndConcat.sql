-- ALIAS
SELECT * FROM actor;
SELECT first_name AS ad,last_name AS soyad FROM actor; -- updates column names temporarily for this specific query
SELECT first_name ad,last_name soyad FROM actor; -- same
SELECT first_name AS ad test,last_name soyad test FROM actor; -- syntax error
SELECT first_name AS "ad test",last_name "soyad test" FROM actor; -- " " for when you use multiple words

SELECT COUNT(*) AS "aktor sayısı" FROM actor;

-- CONCAT
SELECT CONCAT(first_name,' ',last_name) AS "Ad ve Soyad" FROM actor;