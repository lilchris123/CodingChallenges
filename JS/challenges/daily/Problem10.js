/**
Implement a job scheduler which takes in a function f and an integer n, 
and calls f after n milliseconds.
*/

function jobScheduler(func,n){
    setTimeout(()=> func(), n*1000);
}
function hello(){
    console.log("hello");
}

jobScheduler(hello,5);