--Aggregate functions
SELECT * FROM film;

SELECT COUNT(*) FROM film; --count is an aggregate function we learned previously

SELECT MAX(replacement_cost) FROM film; -- prints max of selected column

SELECT MIN(replacement_cost) FROM film -- prints min of selected column

SELECT AVG(length) FROM film; -- prints arithmetic average of selected column

SELECT ROUND(AVG(length)) FROM film; -- round up the number

SELECT SUM(rental_rate) FROM film; -- sum up numbers on the column



SELECT MAX(length),MIN(length),SUM(replacement_cost) FROM film; -- you can use more than one aggregate function on the same query
SELECT MAX(length) FROM film WHERE rental_rate=0.99;
SELECT MAX(length),rental_rate FROM film WHERE rental_rate IN (0.99,2.99); -- wrong syntax, can't combine column calls and aggregate functions together