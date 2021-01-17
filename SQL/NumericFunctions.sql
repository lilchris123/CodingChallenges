# rounds up the number
select ceil(15.1);

# rounds down the number
select floor(15.8);

#the first num to the power of 2nd num
select pow(4,2);

#gets the max of the numbers
select greatest(4,2,8,1);

#need to use sakila
use sakila;

#show payment
select * from payment;

#show payment_id, amount, round up amount as high_amt and only 1-10 payments
select payment_id, amount, ceil(amount) as high_amt from payment
where payment_id between 1 and 10;

#show payment_id, amount, round down amount as high_amt and only 1-10 payments
select payment_id, amount, floor(amount) as low_amt from payment
where payment_id between 1 and 10;

#show payment_id, amount, round up amount as high_amt 
# square the ceil of amount and only show 1-10 payments
select payment_id, amount, ceil(amount) as high_amt,
pow(ceil(amount),2) as amtSqr
from payment
where payment_id between 1 and 10;

#show payment_id, amount, greatest of amount and 3
select payment_id, amount, greatest(amount,3)
 as greatestAmt from payment;
 