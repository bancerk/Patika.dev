--SUB QUERY
SELECT * FROM book
WHERE page_number>466;

SELECT page_number FROM book
WHERE title='Gülün Adı';

SELECT * FROM book
WHERE page_number>
(SELECT page_number FROM book
WHERE title='Gülün Adı'); -- subquery must return only 1 result

SELECT title,page_number,(SELECT MAX(page_number) FROM book),((SELECT MAX(page_number) FROM book) - page_number) AS differ
FROM book
WHERE page_number >
(SELECT page_number FROM book
WHERE title='Gülün Adı');

--ANY and ALL Operators
-- subquery must return only 1 result
SELECT first_name,last_name FROM author
WHERE id=
(SELECT id FROM book WHERE title='Fear Island' OR title='Napoleon Dynamite'); -- more than 1 result returns, syntax error

--ANY
-- output contains any true result from the subquery
SELECT first_name,last_name FROM author
WHERE id=ANY
(SELECT id FROM book WHERE title='Fear Island' OR title='Napoleon Dynamite');

--ALL
-- output returns only if all results are true from the subquery
SELECT first_name,last_name FROM author
WHERE id>ALL
(SELECT id FROM book WHERE title='Fear Island' OR title='Napoleon Dynamite');