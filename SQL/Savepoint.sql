use testdb;

drop table pet;

set session autocommit=0;

create table pet(pet_id int, pet_type varchar(100));

#insert
savepoint before_insert;

insert into pet values(1, "dog");
insert into pet values(2, "cat");
insert into pet values(3, "rabbit");

#select all
select * from pet;

#delete
savepoint before_delete;

delete from pet where pet_id=1;

select * from pet;

savepoint before_update;

update pet set pet_type='fish' where pet_id =2;

select * from pet;

rollback to before_delete;

rollback;

