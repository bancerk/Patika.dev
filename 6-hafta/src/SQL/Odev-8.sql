CREATE TABLE employee(
id serial PRIMARY KEY,
first_name VARCHAR(50),
birthday DATE,
email VARCHAR(100)
);

SELECT * FROM employee;

insert into employee (first_name, birthday, email) values ('Teddy', '1980-02-22', 'terbain0@google.co.jp');
insert into employee (first_name, birthday, email) values ('Cynthia', '1988-01-19', 'cferrao1@netlog.com');
insert into employee (first_name, birthday, email) values ('Guillema', '1981-09-08', 'gbishopp2@delicious.com');
insert into employee (first_name, birthday, email) values ('Ara', '1998-06-01', 'aretallack3@si.edu');
insert into employee (first_name, birthday, email) values ('Guenna', '1997-11-20', 'gfissenden4@furl.net');
insert into employee (first_name, birthday, email) values ('Elbertina', '1991-01-16', 'emasding5@huffingtonpost.com');
insert into employee (first_name, birthday, email) values ('Jena', '1981-04-27', 'jbexon6@kickstarter.com');
insert into employee (first_name, birthday, email) values ('Carl', '1987-11-28', 'ckorpolak7@reverbnation.com');
insert into employee (first_name, birthday, email) values ('Ab', '1995-06-21', 'ashirland8@ca.gov');
insert into employee (first_name, birthday, email) values ('Worthington', '1985-10-28', 'wdormer9@delicious.com');
insert into employee (first_name, birthday, email) values ('Tamara', '1979-07-17', 'tjorgera@wunderground.com');
insert into employee (first_name, birthday, email) values ('Marijn', '1972-12-16', 'mbednellb@g.co');
insert into employee (first_name, birthday, email) values ('Henrietta', '1973-11-18', 'hmacardc@uol.com.br');
insert into employee (first_name, birthday, email) values ('Clement', '1974-04-15', 'ccheyenned@techcrunch.com');
insert into employee (first_name, birthday, email) values ('Ivor', '1994-10-25', 'itworte@creativecommons.org');
insert into employee (first_name, birthday, email) values ('Robert', '1970-05-04', 'rverchambref@hibu.com');
insert into employee (first_name, birthday, email) values ('Mitchell', '1986-01-17', 'mbimg@myspace.com');
insert into employee (first_name, birthday, email) values ('Eryn', '1998-04-18', 'enittoh@goodreads.com');
insert into employee (first_name, birthday, email) values ('Alika', '1997-01-11', 'afrisbyi@indiegogo.com');
insert into employee (first_name, birthday, email) values ('Dollie', '1987-09-21', 'dplumbj@youku.com');
insert into employee (first_name, birthday, email) values ('Stesha', '1992-02-26', 'scosgryk@4shared.com');
insert into employee (first_name, birthday, email) values ('Calv', '1992-12-30', 'cgibberdl@si.edu');
insert into employee (first_name, birthday, email) values ('Tucky', '1975-02-13', 'thortm@harvard.edu');
insert into employee (first_name, birthday, email) values ('Wayne', '1982-02-19', 'wkneathn@prweb.com');
insert into employee (first_name, birthday, email) values ('Luelle', '1973-09-21', 'lflanderso@mozilla.com');
insert into employee (first_name, birthday, email) values ('Raphael', '1984-05-06', 'rdumkep@nifty.com');
insert into employee (first_name, birthday, email) values ('Cleo', '1998-07-29', 'cblowfeldeq@scribd.com');
insert into employee (first_name, birthday, email) values ('Pierette', '1976-01-06', 'psporesr@soup.io');
insert into employee (first_name, birthday, email) values ('Boony', '1988-07-07', 'bfruens@live.com');
insert into employee (first_name, birthday, email) values ('Nola', '1971-05-12', 'nbraunert@sohu.com');
insert into employee (first_name, birthday, email) values ('Swen', '1971-05-20', 'skeelyu@dropbox.com');
insert into employee (first_name, birthday, email) values ('Kelila', '1974-03-23', 'ksherwinv@ucoz.com');
insert into employee (first_name, birthday, email) values ('Ingrim', '1996-02-14', 'iturtlew@goodreads.com');
insert into employee (first_name, birthday, email) values ('Yoshi', '1984-05-05', 'ysandwithx@bloglovin.com');
insert into employee (first_name, birthday, email) values ('Les', '1970-09-19', 'lmillery@boston.com');
insert into employee (first_name, birthday, email) values ('Filip', '1999-04-10', 'felcomz@japanpost.jp');
insert into employee (first_name, birthday, email) values ('Steward', '1993-07-13', 'srowen10@gravatar.com');
insert into employee (first_name, birthday, email) values ('Eric', '1983-04-15', 'earents11@soundcloud.com');
insert into employee (first_name, birthday, email) values ('Julianne', '1995-12-30', 'jdewicke12@taobao.com');
insert into employee (first_name, birthday, email) values ('Corrine', '1980-09-25', 'chaddon13@paginegialle.it');
insert into employee (first_name, birthday, email) values ('Germaine', '1973-04-20', 'gflucker14@chron.com');
insert into employee (first_name, birthday, email) values ('Alard', '1970-05-22', 'aharling15@yandex.ru');
insert into employee (first_name, birthday, email) values ('Verna', '1992-05-16', 'vtesmond16@storify.com');
insert into employee (first_name, birthday, email) values ('Petronia', '1976-03-14', 'pfreschini17@t.co');
insert into employee (first_name, birthday, email) values ('Raffarty', '1996-09-07', 'rrubinow18@forbes.com');
insert into employee (first_name, birthday, email) values ('Melly', '1981-06-03', 'mcrimp19@hud.gov');
insert into employee (first_name, birthday, email) values ('Ezra', '1991-02-22', 'ecunnington1a@newsvine.com');
insert into employee (first_name, birthday, email) values ('Winston', '1982-03-24', 'wavrahamy1b@oaic.gov.au');
insert into employee (first_name, birthday, email) values ('Xylia', '1979-02-13', 'xhopfner1d@prnewswire.com');
insert into employee (first_name, birthday, email) values ('Hunter', '1991-02-04', 'harnfield1c@hexun.com');

UPDATE employee SET first_name='Babushka' WHERE birthday<'19800101' AND email LIKE '%@yandex%' RETURNING *;
UPDATE employee SET email='worth@it.com' WHERE id=10 RETURNING *;
UPDATE employee SET birthday='19690420' WHERE email='gflucker14@chron.com' RETURNING *;
UPDATE employee SET first_name='Dolly' WHERE first_name='Dollie' RETURNING *;
UPDATE employee SET first_name='MyspaceGuy' WHERE email='mbimg@myspace.com' RETURNING *;

DELETE FROM employee WHERE email LIKE '%@wunderground%';
DELETE FROM employee WHERE id=50;
DELETE FROM employee WHERE birthday<'19770101' RETURNING *;
DELETE FROM employee WHERE first_name='Xylia' RETURNING *;
DELETE FROM employee WHERE first_name='Boony' OR email='rrubinow18@forbes.com' RETURNING *;