//recursion
function fact(n){
    if(n == 1)
        return 1;
    return n* fact(--n);
}

//bottom up
let fact2 =(n)=>{
    let total=1;
    for(let i=1; i<=n; i++)
        total*=i;
    return total;
}
console.log(fact2(5));