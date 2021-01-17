#Write a SQL query to delete all duplicate email entries in a table named Person, 
#keeping only unique emails based on its smallest Id.

#create table schema
create table PersonEmail(
Id int auto_increment primary key,
Email varchar(100)
);

#insert test data
insert into PersonEmail(Email) values("john@gmail.com");
insert into PersonEmail(Email) values("bob@gmail.com");
insert into PersonEmail(Email) values("john@gmail.com");

select * from PersonEmail;

#delete all duplicate emails while keeping the smallest Id record
# use a duplicate PersonEmail table for finding the duplicates and delete the ones with higher IDs
Delete p1 from PersonEmail p1, PersonEmail p2
where p1.Email = p2.Email && p1.Id >p2.Id;