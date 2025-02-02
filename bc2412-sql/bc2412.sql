-- this is a comment line
-- MySOLWorkbench is a client side -> connect (ip/port/id/password) -> MySQL Server (7x24)

-- mySQL DBMS -> case insensitive

create database bootcamp_2412;

-- use database
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
from orders o;

select o.*, date_add(o.order_date, interval 3 day) as follow_up_date
from orders o;

select o.*, date_add(o.order_date, interval 2 year) as follow_up_date
from orders o;

-- Separate the data into groups, by a column (customer_id)
-- After group by, you can only select the column that you used for "Group"
select customer_id, count(1) as order_count, avg(amount) as average_order_amount, max(amount), min(amount)
from orders
group by customer_id;

-- from -> where -> group by -> select
select customer_id, sum(amount) as total_order_amt, count(1) as order_count
from orders
where amount < 5000
group by customer_id;

-- 3 5
-- 1 1

-- Database Type: Relational DB (Structure -> Schema -> row x column)
-- INNER JOIN (customer x orders)
-- 1. Find order count by customer, show customer ID, show first_name, last_name, order count

-- 3 customers x 6 orders (show all combination possibilities)
-- select c.*, o.*
select c.id as customer_id, c.first_name, c.last_name, count(1) as order_count
from customers c inner join orders o -- "on" before join
on o.customer_id = c.id
-- where o.amount < 5000 -- "where" after join, but before group
group by c.id, c.first_name, c.last_name;

select c.id, c.first_name, c.last_name, count(1) as order_count
from customers c, orders o
where c.id = o.customer_id
and o.amount < 5000
group by c.id, c.first_name, c.last_name;

-- group by + having
select c.id, c.first_name, c.last_name, count(1) as order_count
from customers c, orders o
where c.id = o.customer_id -- filter record (rows)
and o.amount < 5000
group by c.id, c.first_name, c.last_name
having count(1) > 1 -- after group by -> filter group
order by c.id;

-- distinct
select distinct customer_id
from orders;

select distinct last_name
from customers;

insert into customers (id, first_name, last_name, email, dob)
values (4, 'Vincent', 'Lau', 'vincentlau@gmail.com', '1999-12-31');

select last_name, first_name, count(1)
from customers
group by last_name, first_name;

-- Distinct column should exist in "group by"

-- select distinct id 
-- from customers
-- group by last_name, first_name;

-- LEFT JOIN (show all records of the left table)
-- find all customers with his orders
select c.*, o.*
from customers c left join orders o on c.id = o.customer_id;

select c.*, o.*
from orders o left join customers c on c.id = o.customer_id;

-- RIGHT JOIN
select c.*, o.*
from customers c right join orders o on c.id = o.customer_id;

select c.*, o.*
from orders o right join customers c on c.id = o.customer_id;

-- find the customer who didn't place oreder
-- left join + where
select c.*
from customers c left join orders o on c.id = o.customer_id
where o.id is null;

CREATE TABLE Adopters (
    id INT PRIMARY KEY,
    name VARCHAR(30),
    age INT
);

select *
from students;

-- Add PK for customers
ALTER TABLE customers ADD CONSTRAINT pk_customer_id PRIMARY KEY (id);
ALTER TABLE orders ADD CONSTRAINT pk_order_id PRIMARY KEY (id);
-- Add FK for Orders
ALTER TABLE Orders ADD CONSTRAINT fk_customer_id FOREIGN KEY (customer_id) REFERENCES customer(id);

-- NOt allowed. FK fail.
-- insert into orders values (7, 400.0, current_time(), 99);

-- MANY TO MANY DESIGN
CREATE TABLE STUDENTS (
	ID INT PRIMARY KEY AUTO_INCREMENT, --  NOT NULL
    NAME VARCHAR(50) NOT NULL, 
    EMAIL VARCHAR(50) UNIQUE -- IS IT NOT NULL? CAN BE NULL
);

CREATE TABLE SUBJECTS (
	ID INT PRIMARY KEY auto_increment,
    NAME VARCHAR(30) NOT NULL
);

CREATE TABLE STUDENT_SUBJECTS (
	ID INT NOT NULL UNIQUE,
    STUDENT_ID INT,
    SUBJECT_ID INT,
    PRIMARY KEY (STUDENT_ID, SUBJECT_ID),
    FOREIGN KEY (STUDENT_ID) REFERENCES STUDENTS(ID), -- FK CAN BE NULL
    FOREIGN KEY (SUBJECT_ID) REFERENCES SUBJECTS(ID) -- FK CAN BE NULL
);

DROP table STUDENT_SUBJECTS;
DROP table STUDENTS;
DROP table SUBJECTS;

insert into students (name, email) values ('Vincent', 'vincentlau@gmail.com');
insert into students (name, email) values ('Lucas', 'lucaslau@gmail.com');

INSERT INTO SUBJECTS (NAME) VALUES ('MATH');
INSERT INTO SUBJECTS (NAME) VALUES ('ENGLISH');
INSERT INTO SUBJECTS (NAME) VALUES ('HISTORY');

INSERT INTO STUDENT_SUBJECTS(STUDENT_ID, SUBJECT_ID) VALUES (1, 3);
INSERT INTO STUDENT_SUBJECTS(STUDENT_ID, SUBJECT_ID) VALUES (1, 2);
INSERT INTO STUDENT_SUBJECTS(STUDENT_ID, SUBJECT_ID) VALUES (2, 1);
INSERT INTO STUDENT_SUBJECTS(STUDENT_ID, SUBJECT_ID) VALUES (2, 3);

select * from STUDENTS;
SELECT * FROM SUBJECTS;
SELECT * FROM STUDENT_SUBJECTS;

-- JOIN 3 TABLES
SELECT S.NAME, B.NAME
FROM STUDENT_SUBJECTS SS, STUDENTS S, SUBJECTS B
WHERE SS.STUDENT_ID = S.ID
AND SS.SUBJECT_ID = B.ID;

create or replace view vcustomer_orders
as
select c.id as customer_id, c.first_name, c.last_name, c.email, o.amount, o.order_date, o.id as order_id
from customers c inner join orders o on c.id = o.customer_id
;

-- View:
-- 1. Real time execution for the SQL behind the view.
-- 2. When you modify the SQL behind the view, you have to re-compile view to take effective.
-- 3. View has its own access right (select) so that we can manage access right of tables across accounts.
select * from vcustomer_orders;

alter table customers add order_count INT;

select * from customers;
select * from orders;

insert into orders (id, amount, order_date, customer_id)
values (8, 100.9, current_time(), 1); 

drop trigger update_order_count;

DELIMITER //

CREATE TRIGGER update_order_count
AFTER INSERT ON orders
FOR EACH ROW
BEGIN
    -- TRIGGER CUSTOMER'S TRIGGER
    UPDATE customers
    SET order_count = order_count + 1
    WHERE id = NEW.customer_id;
END;
//

DELIMITER ;

select * from customers;

create table table_logs (
	id int primary key,
	table_name varchar(50),
	column_name varchar(50),
	old_value varchar(50),
	new_value varchar(50)
);

drop table table_logs;

update customers set dob = '2000-01-10' where id = 1;

DELIMITER //

CREATE TRIGGER update_customer_data
AFTER INSERT ON customers
FOR EACH ROW
BEGIN
   IF (OLD.dob <> NEW.dob) THEN
	insert into table_logs (table_name, column_name, old_value, new_value)
	values ('CUSTOMERS', 'DOB', OLD.dob, NEW.dob);
	END IF;
END;
//

DELIMITER ;

select * from table_logs;
