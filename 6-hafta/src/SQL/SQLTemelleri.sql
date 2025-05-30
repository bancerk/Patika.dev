--SELECT
--SELECT column1 FROM table1;
SELECT title,description FROM film;
SELECT * FROM film; --output all columns
SELECT first_name,last_name FROM actor;

--WHERE
SELECT * FROM film WHERE replacement_cost=12.99;
SELECT title,length FROM film 
WHERE rental_rate=0.99; --";" indicates end of the line, SQL ignores line breaks
SELECT * FROM actor
WHERE first_name='Penelope';-- = assign       '' string

--Comparison operators
SELECT * FROM film WHERE length>90;
SELECT * FROM film WHERE rental_rate<1;
SELECT * FROM film WHERE rental_rate!=0.99;
SELECT * FROM film WHERE rental_rate<>4.99; --output all except rental rate 4.99

--Logical operators
SELECT * FROM actor WHERE first_name='Penelope' AND last_name='Monroe';
SELECT * FROM actor WHERE first_name='Penelope' OR first_name='Bob';
SELECT * FROM actor WHERE first_name='Penelope' AND last_name='Monroe' OR first_name='Bob'AND last_name='Fawcett'; -- OR operates as if a new filter is being applied from scratch
SELECT * FROM actor WHERE first_name='Penelope' AND NOT last_name='Monroe';
SELECT * FROM actor WHERE first_name='Penelope' AND last_name!='Monroe';

SELECT * FROM film WHERE rental_rate=4.99 AND length>90;
SELECT * FROM film WHERE rental_rate=4.99 AND rental_rate=2.99; --syntax error
SELECT * FROM film WHERE rental_rate=4.99 OR rental_rate=2.99;
SELECT * FROM film WHERE rental_rate=4.99 AND rental_duration=3 AND replacement_cost>20;
SELECT * FROM film WHERE replacement_cost<12 AND replacement_cost>25; --syntax error
SELECT * FROM film WHERE replacement_cost<12 OR replacement_cost>25;

SELECT * FROM film WHERE NOT rental_rate=4.99;
SELECT * FROM film WHERE NOT (rental_rate=4.99 AND replacement_cost=20.99); --both filters need to be true for output
SELECT * FROM film WHERE NOT (NOT (rental_rate=4.99 AND replacement_cost=20.99)); -- NOT operators cancel out
SELECT * FROM film WHERE NOT NOT length>110;
