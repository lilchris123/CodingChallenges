function isPrime(n){
    if(n == 2 || n== 3 || n==5 || n == 7) return true;
    return n % 2 !=0 && n % 3 !=0 && n%5 !=0 && n % 7 !=0 ? true : false;
}

console.log(isPrime(1));