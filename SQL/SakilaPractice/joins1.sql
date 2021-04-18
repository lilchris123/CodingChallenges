/*show all the actors and their film and film's language*/
select CONCAT(a.first_name,' ',a.last_name) as actor, f.title as film,
       l.name as language from film f

    inner join language l on f.language_id = l.language_id
    inner join film_actor fa on f.film_id = fa.film_id
    inner join actor a on fa.actor_id = a.actor_id;