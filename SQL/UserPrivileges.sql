#create user
create user 'testUser' identified by '123';


#drop user
drop user 'testUser';

#grant access to all database syntax;
#grant all on database.* to 'testUser';

#grant all database.* to 'testUser';
grant all on *.* to 'testUser';

grant all on sakila.* to 'testUser';

#grant read access sakila database to testUser
grant select on sakila.* to 'testUser';

#revoke access to all databases
#will run, even if says it's error
revoke all on sakila.* from 'testUser';

#show grants

show grants for current_user();

