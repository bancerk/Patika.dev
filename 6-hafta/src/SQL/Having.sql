-- HAVING
SELECT rental_rate,COUNT(*) FROM film GROUP BY rental_rate;

-- HAVING parameter is used to filter data on grouped outputs, to put it crudely, HAVING is the same as WHERE for GROUP BY
SELECT rental_rate,COUNT(*) FROM film GROUP BY rental_rate HAVING  COUNT(*)>325;
SELECT rental_rate,COUNT(*) FROM film WHERE rental_rate!=2.99 GROUP BY rental_rate;
-- same output, but execution is different, WHERE is executed before grouping and for each line, HAVING is executed after grouping

SELECT * FROM payment;
SELECT COUNT(*) FROM payment;
SELECT staff_id,COUNT(*) FROM payment GROUP BY staff_id;
SELECT staff_id,COUNT(*) FROM payment GROUP BY staff_id HAVING COUNT(*)>7300;

SELECT customer_id, SUM(amount) FROM payment GROUP BY customer_id HAVING SUM(amount)>100 ORDER BY SUM(amount) DESC LIMIT 1;