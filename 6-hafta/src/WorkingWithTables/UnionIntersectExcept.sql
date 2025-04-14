--UNION
(SELECT * FROM book ORDER BY page_number DESC LIMIT 5)
UNION
(SELECT * FROM book ORDER BY title LIMIT 5);

(SELECT id,email FROM author)
UNION
(SELECT id,title FROM book); -- Column numbers must be same, column data types must match
-- UNION hides repeating data, to see duplicates use UNION ALL

--INTERSECT
-- Only shows duplicate data from UNION ALL
-- Again, Column numbers must be same, column data types must match
(SELECT * FROM book ORDER BY page_number DESC)
INTERSECT
(SELECT * FROM book ORDER BY title);

--EXCEPT
-- prints data that exists on query1 but NOT on query2
-- Again, Column numbers must be same, column data types must match
(SELECT * FROM book ORDER BY page_number DESC)
EXCEPT
(SELECT * FROM book ORDER BY title);