--LIMIT
SELECT * FROM film LIMIT 20;
SELECT * FROM film WHERE rental_rate=4.99 ORDER BY length LIMIT 10; -- limiting should be at the end of the query
SELECT * FROM film WHERE replacement_cost=14.99 AND rental_rate=0.99 ORDER BY length DESC LIMIT 7;

--OFFSET
SELECT * FROM country OFFSET 6 LIMIT 4; -- skips printing first 6 entries on the table
SELECT * FROM actor WHERE first_name='Penelope' ORDER BY last_name OFFSET 2 LIMIT 1;