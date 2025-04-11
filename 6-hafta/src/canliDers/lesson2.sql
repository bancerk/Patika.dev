--select from where
select * from actor where first_name='Nick' or last_name='Stallone';
--between
select  actor_id, first_name from actor where actor_id between 3 and 6;
--in
select * from actor where actor_id in(1,6,3,252);
select * from actor where actor_id=252;
--like(büyük/küçük harf duyarlı) , ilike
select * from actor where first_name ilike '%A';

--order by
select * from actor order by last_name ASC;--ascending -- (biz ASC yazmasakta default olarak ASC kullanılır)
select * from actor order by last_name DESC;--descending

--limit y -(ilk y datayı getir)
-- offset x ->(ilk x datayı atla)
select * from actor limit 3;
select * from actor offset 3;
select * from actor offset 2 limit 3;

--aggregate
select * from payment;
--sum
select sum(amount) from payment;
--count
select count(*) from payment;
--min max
select min(amount) from payment;
select max(amount) from payment;
--avg
select avg(amount) from payment;
--round 
select round(avg(amount),3) from payment;

--group by
select * from city;
select country_id from city group by country_id;
select count(*),country_id from city group by country_id;

select * from city where country_id=97;

--having (group by ve agragate ile birlikte kullanılır)
select count(*),country_id from city group by country_id having country_id<20;
select count(*),country_id from city group by country_id having country_id<20 order by country_id;

--null kopntrolü
select * from film where description is not null;





