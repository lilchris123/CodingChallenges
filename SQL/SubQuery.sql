use sakila;

select * from film;

select * from film where id= 1;

select * from fim_actor;
select * from actor;

select * from actor
where actor_id in (select actor_id from film_actor where film_id=1);

select * from actor;

select * from actor where first_name = "sissy";

# first subquery: fid all films sissy is in from the film_actor table
select * from film_actor where actor_id= (select actor_id from actor where first_name = "sissy");

select * from film 
where film_id in (select film_id from film_actor 
					where actor_id =(select actor_id from actor 
										where first_name = "sissy")) and rental_rate <3;

