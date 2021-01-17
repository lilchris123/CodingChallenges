use testdb;

#set session so no autocommits completed
set session autocommit =0;

#create table
create table pet(pet_id int, pet_type varchar(100));


#first commit
commit;

#insert values

insert into pet values(1, "dog");
insert into pet values(2, "cat");
insert into pet values(3, "rabbit");

#select everything
select * from pet;

#undo all changes to last commit
rollback;
