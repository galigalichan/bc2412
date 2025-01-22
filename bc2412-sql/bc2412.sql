-- this is a comment line
-- MySOLWorkbench is a client side -> connect (ip/port/id/password) -> MySQL Server (7x24)

-- mySQL DBMS -> case insensitive

create database bootcamp_2412;

use bootcamp_2412;

-- MySQL Server may contains many databases, one database may contains many 
-- varchar = String
create table customers (	
	id integer,
    first_name varchar(20),
    last_name varchar(20),
    email varchar(50),
    dob date
);

-- * means all columns
select *
from customers;

insert into customers (id, first_name, last_name, email, dob)
values (1, 'Vincent', 'Lau', 'vincentlau@gmail.com', '1999-12-31');
insert into customers (id, first_name, last_name, email, dob)
values (2, 'Lucas', 'Lau', 'lucaslau@gmail.com', '1999-10-31');
insert into customers (id, first_name, last_name, email, dob)
values (3, 'Sally', 'Wong', 'sallywong@gmail.com', '2000-01-31');

-- delete all data from table
delete from customers;

-- delete data by criteria
delete from customers where last_name = 'Wong';

-- select specific columns
-- select is to choose columns
select id, first_name, dob from customers;

-- where is to control rows
select id, first_name, dob from customers where dob < '2000-01-01';

-- SELECT doesn't change the data in harddisk. SQL is just using a program to retrieve data in harddisk
-- insert, delete change the data in harddisk

-- More than one criteria
select * from customers where last_name = 'Lau' and dob > '1999-12-01';
select * from customers where last_name = 'Lau' or first_name = 'Sally';

-- and has higher priority to execute
select * from customers where last_name = 'Lau' or first_name = 'Sally' and dob > '2000-01-01';
select * from customers where (last_name = 'Lau' or first_name = 'Sally') and dob > '2000-01-01';

-- Not equals to

-- order by (default asc)
select * from customers order by first_name;
-- order by asc
select * from customers order by first_name asc;
-- order by desc (~0.38ms)
select * from customers order by first_name desc;
select * from customers where dob > '2000-01-01' order by id desc; -- stream().filter().sorted()

-- table: orders
-- id, amount, order_date, customer id
create table orders (
id integer,
amount decimal(13,2), -- 11 is for integer digit, 2 is for decimal places
order_date datetime,
customer_id integer
);

drop table orders;

select * from orders;

insert into orders (id, amount, order_date, customer_id)
values (1, 100.9, STR_TO_DATE('2020-12-31 23:10:59', '%Y-%m-%d %H:%i:%s'), 1);

insert into orders (id, amount, order_date, customer_id)
values (2, 999.9, current_time(), 3);

insert into orders (id, amount, order_date, customer_id)
values (3, 1999.2, current_time(), 3);

insert into orders values (4, 9999.9, current_time(), 3);

insert into orders values
	(5, 12000, current_time(), 3),
	(6, 15000, current_time(), 3)
    ;
    
-- sum(), avg(), min(), max(), count() -> aggregate function -> result data structure changed
select sum(amount) from orders;
select avg(amount) from orders;
select min(amount) from orders;
select max(amount) from orders;
select count(amount) from orders;

-- NOT OK
select sum(amount), id from orders;
-- OK
select sum(amount) as total_amt
, round(avg(amount),2) as avg_amt
, min(amount) as lowest_amt
, max(amount) as highest_amt
, count(amount) as order_amt
, 1, 'hello'
from orders
where amount > 1000;

-- SQL sequence
-- 1. FROM
-- 2. WHERE
-- 3. GROUP BY (HAVING)
-- 4. ORDER BY
-- 5. SELECT COLUMNS

-- Math
select floor(o.amount), o.* from orders o; -- down to nearest integer
select ceil(o.amount), o.* from orders o; -- up to nearest integer
select abs(-4), abs(4) from dual;

-- String
select concat(c.first_name, ' ', c.last_name) as full_name
, length(c.last_name) as length_of_lastname
, upper(c.first_name) as uppercase_firstname
, lower(c.first_name) as lowercase_firstname
, replace(c.email, '@', '$') as new_email
, substring(c.first_name, 1, 1) as first_name_initial
, left(c.first_name, 2) as left_first_name
, right(c.first_name, 2) as right_first_name
, instr(c.first_name, 'V') as firstname_contains_cap_letter_V
, instr(c.first_name, 'v') as firstname_contains_small_letter_v
, c.*
from customers c;

-- LIKE
-- % means any characters
select *
from customers
where first_name like '%V%';

select *
from customers
where first_name like '%V%T';

-- DATE
select o.*, date_add(o.order_date, interval 3 month) as follow_up_date
from orders o