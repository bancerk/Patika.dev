-- JOIN
SELECT title,first_name,last_name FROM book
INNER JOIN author ON book.author_id=author.id;

SELECT * FROM book INNER JOIN author ON book.author_id=author.id;
SELECT * FROM book JOIN author ON book.author_id=author.id; -- JOIN = INNER JOIN by default

SELECT book.title,author.first_name,author.last_name FROM book
INNER JOIN author ON book.author_id=author.id; -- explicitly verbose which table columns belong to

SELECT Products.ProductName,Categories.CategoryName FROM Products INNER JOIN Categories ON Products.CategoryID = Categories.CategoryID;