--LIKE
-- "%" wildcard
SELECT * FROM customer WHERE first_name LIKE 'M%';
SELECT * FROM customer WHERE first_name LIKE 'Ma%';
SELECT * FROM customer WHERE first_name LIKE 'Mary%';
SELECT * FROM customer WHERE first_name LIKE 'A%y';
SELECT * FROM customer WHERE first_name LIKE 'A%' AND last_name LIKE 'A%';

--ILIKE
SELECT * FROM customer WHERE first_name LIKE 'a%';-- case sensitive
SELECT * FROM customer WHERE first_name ILIKE 'a%'; -- Not case sensitive

-- NOT usage
SELECT * FROM customer WHERE first_name LIKE 'D%n';
SELECT * FROM customer WHERE first_name NOT LIKE 'D%n';
SELECT * FROM customer WHERE first_name NOT LIKE 'A%';

-- "_" Single character wildcard
SELECT * FROM customer WHERE first_name LIKE 'J_an';
SELECT * FROM customer WHERE first_name LIKE 'J_';
SELECT * FROM customer WHERE first_name LIKE 'J_n';
SELECT * FROM customer WHERE first_name LIKE 'J%n';

SELECT * FROM actor WHERE first_name LIKE 'P%';
SELECT * FROM actor WHERE first_name LIKE 'T_m';
SELECT * FROM actor WHERE first_name ~~ 'A%'; -- "~~" same as LIKE
SELECT * FROM actor WHERE first_name ~~* 'b%'; -- "~~*" same as ILIKE
SELECT * FROM actor WHERE first_name !~~* 'b%'; -- "!" indicates NOT