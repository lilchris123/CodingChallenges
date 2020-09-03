//check if number is prime

function isPrime(n){
    //iterate from 2 to n
    for(let i=2; i<n; i++){
        //if divisible by to is not a prime
        if(n%2==0)
            return false;
    }
    //else the number is  prime
    return true;
}

console.log(isPrime(12));