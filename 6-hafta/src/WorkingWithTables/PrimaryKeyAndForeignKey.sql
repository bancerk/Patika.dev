-- PRIMARY KEY and FOREIGN KEY
CREATE TABLE book (
id SERIAL PRIMARY KEY,
title VARCHAR(100) NOT NULL,
page_number INTEGER NOT NULL,
author_id INTEGER REFERENCES author(id)
);

SELECT * FROM book;

insert into book (title, page_number, author_id) values ('Bohème, La', 366, 2);
insert into book (title, page_number, author_id) values ('Fear Island', 766, 2);
insert into book (title, page_number, author_id) values ('Pruitt-Igoe Myth, The', 638, 7);
insert into book (title, page_number, author_id) values ('Bonjour Monsieur Shlomi (Ha-Kochavim Shel Shlomi)', 515, 8);
insert into book (title, page_number, author_id) values ('Napoleon Dynamite', 561, 5);
insert into book (title, page_number, author_id) values ('Son of Monte Cristo, The', 620, 9);
insert into book (title, page_number, author_id) values ('Crash Dive', 718, 9);
insert into book (title, page_number, author_id) values ('Vegucated', 788, 8);
insert into book (title, page_number, author_id) values ('Beau Serge, Le', 784, 7);
insert into book (title, page_number, author_id) values ('Where a Good Man Goes (Joi gin a long)', 915, 3);
insert into book (title, page_number, author_id) values ('Bow, The (Hwal)', 463, 10);
insert into book (title, page_number, author_id) values ('Mating Season, The', 191, 9);
insert into book (title, page_number, author_id) values ('Rude', 334, 8);
insert into book (title, page_number, author_id) values ('Projectionist, The', 587, 9);
insert into book (title, page_number, author_id) values ('Mackenna''s Gold', 648, 7);

--JOIN
SELECT * FROM book WHERE author_id=2;
SELECT * FROM book JOIN author ON author.id=book.author_id;