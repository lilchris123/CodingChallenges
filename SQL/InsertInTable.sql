use testdb;

create table BLAZER_DAY(
id int(1) not null auto_increment primary key,
day char(10));

insert into BLAZER_DAY(day) values("Sunday");
insert into BLAZER_DAY(day) values("Monday");
insert into BLAZER_DAY(day) values("Tuesday");
insert into BLAZER_DAY(day) values("Wednesday");
insert into BLAZER_DAY(day) values("Thursday");
insert into BLAZER_DAY(day) values("Friday");
insert into BLAZER_DAY(day) values("Saturday");

UPDATE BLAZER_DAY SET day= "Blazerday!" where id in('2');
UPDATE BLAZER_DAY SET day= "Blazerday!" where id in('5');

select * from BLAZER_DAY;
