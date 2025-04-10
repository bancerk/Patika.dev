--DISTINCT
SELECT DISTINCT rental_rate FROM film; -- lists only unique values
SELECT DISTINCT replacement_cost FROM film;
SELECT DISTINCT country FROM country;
SELECT DISTINCT rating,special_features FROM film; -- lists unique pairs (values can repeat but pairs are unique)

--COUNT
SELECT COUNT(*) FROM actor WHERE first_name='Penelope'; -- counts number of values
SELECT COUNT(*) FROM actor WHERE first_name LIKE 'A%';
SELECT COUNT(first_name) FROM actor WHERE first_name LIKE 'A%'; -- Paranteses indicate column name, usually COUNT is used with (*)

--Use with DISTINCT
SELECT * FROM actor;
SELECT COUNT(*) FROM actor;
SELECT DISTINCT first_name FROM actor;
SELECT COUNT(DISTINCT first_name) FROM actor;

SELECT * FROM film;
SELECT COUNT(*) FROM film;
SELECT COUNT(DISTINCT length) FROM film;