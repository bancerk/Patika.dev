-- SELECT * FROM film;

SELECT AVG(rental_rate) FROM film; -- 2.98

SELECT COUNT(*) FROM film WHERE title LIKE 'C%'; -- 92

SELECT MAX(length) FROM film WHERE rental_rate=0.99; -- 184

SELECT COUNT(DISTINCT replacement_cost) FROM film WHERE length>150; -- 21