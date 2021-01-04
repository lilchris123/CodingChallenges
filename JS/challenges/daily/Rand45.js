/*
Using a function rand5() that returns an integer from 1 to 5 (inclusive) with uniform probability, 
implement a function rand7() that returns an integer from 1 to 7 (inclusive).
*/

function rand5(){
    return 1+Math.floor(Math.random()*5);
}

function rand7(){
    let result= rand5();
    return result == 5 ? 5 + Math.floor(Math.random()*3) : result;
}

console.log(rand7());