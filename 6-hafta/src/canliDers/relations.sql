create table department(
id serial primary key,
	name varchar(30) not null,
	location varchar(30)
);

create table developer (
id serial primary key,
	name varchar(30) not null,
	age integer check(age>18),
	department_id integer references department(id) 
);

insert into department (name,location) values ('IT','istanbul');
insert into department (name,location) values ('HR','izmir');
insert into department (name,location) values ('AB','bursa');

insert into developer (name,age, department_id) values ('mesut',20,1);
insert into developer (name,age, department_id) values ('kerem',19,2);
insert into developer (name,age, department_id) values ('velihan',41,3);
insert into developer (name,age, department_id) values ('burak',23,3);
insert into developer (name,age, department_id) values ('Ayşe',24,2);

--1.yol
drop table developer;
drop table department;

--CASCADE
drop table department CASCADE;

-------------
create table department(
id serial primary key,
	name varchar(30) not null,
	location varchar(30)
);

create table developer (
id serial primary key,
	name varchar(30) not null,
	age integer check(age>18),
	department_id integer references department(id) ON DELETE CASCADE
);

delete from department where id=2;





