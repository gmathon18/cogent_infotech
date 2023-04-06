create database mydb;
SET GLOBAL time_zone = '+3:00';
create table employee(
id int,
firstName varchar(40),
lastName varchar(40)
);
create table mydb.employee(
id int,
firstName varchar(40),
lastName varchar(40)
);
select * from mydb.employee;
create table mydb.book(
id int,
Name varchar(40),
Price varchar(40)
);
select * from mydb.book;