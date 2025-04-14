--INNER JOIN
SELECT title,first_name,last_name FROM book
INNER JOIN author ON book.author_id=author.id;

SELECT * FROM book
INNER JOIN author ON book.author_id=author.id;

SELECT * FROM book JOIN author ON book.author_id=author.id; -- JOIN = INNER JOIN by default

SELECT book.title,author.first_name,author.last_name FROM book
INNER JOIN author ON book.author_id=author.id; -- explicitly verbose which table columns belong to

SELECT Products.ProductName,Categories.CategoryName FROM Products
INNER JOIN Categories ON Products.CategoryID = Categories.CategoryID;

--LEFT JOIN
-- prints out all of table1, including venn diagram intersection but leaves out items that only exist on table2
SELECT author.first_name,author.last_name,book.title FROM author
LEFT JOIN book ON book.author_id=author.id;

ALTER TABLE book DROP CONSTRAINT book_author_id_fkey;
INSERT INTO book  (title,page_number,author_id)
VALUES
('Gülün Adı',466,44),
('Yapay Zeka',108,55);

SELECT author.first_name,author.last_name,book.title
FROM book
LEFT JOIN author
ON book.author_id=author.id;

SELECT author.first_name,author.last_name,book.title
FROM author
LEFT JOIN book
ON book.author_id=author.id
WHERE book.id IS NOT NULL;

SELECT author.first_name,author.last_name,book.title
FROM author
LEFT JOIN book
ON book.author_id=author.id
WHERE book.id IS NOT NULL
ORDER BY book.title;

SELECT Customers.CustomerName,Orders.OrderID
FROM Orders
LEFT JOIN Customers
ON Customers.CustomerID=Orders.CustomerID
ORDER BY Customers.CustomerName;

--RIGHT JOIN
--same as LEFT JOIN but tables are reversed
SELECT author.first_name,author.last_name,book.title
FROM book
RIGHT JOIN author
ON book.author_id=author.id;

SELECT author.first_name,author.last_name,book.title
FROM book
RIGHT OUTER JOIN author
ON book.author_id=author.id; -- same as JOIN

--FULL JOIN
--prints both table1 and table2, with intersecting data
SELECT *
FROM book
FULL JOIN author
ON book.author_id=author.id;

SELECT *
FROM book
FULL JOIN author
ON book.author_id=author.id
WHERE (book.id IS NOT NULL AND author.id IS NOT NULL); -- same as INNER JOIN

SELECT *
FROM book
FULL JOIN author
ON book.author_id=author.id
WHERE (book.id IS NULL OR author.id IS NULL);
--prints data that only exists on table1 and table2, excluding intersecting data

