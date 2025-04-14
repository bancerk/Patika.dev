(SELECT first_name FROM actor)
UNION
(SELECT first_name FROM customer);

(SELECT first_name FROM actor)
INTERSECT
(SELECT first_name FROM customer);

(SELECT first_name FROM actor)
EXCEPT
(SELECT first_name FROM customer);




(SELECT last_name FROM actor)
UNION
(SELECT last_name FROM customer);

(SELECT last_name FROM actor)
INTERSECT
(SELECT last_name FROM customer);

(SELECT last_name FROM actor)
EXCEPT
(SELECT last_name FROM customer);




(SELECT last_update FROM actor)
UNION
(SELECT last_update FROM customer);

(SELECT last_update FROM actor)
INTERSECT
(SELECT last_update FROM customer);

(SELECT last_update FROM actor)
EXCEPT
(SELECT last_update FROM customer);