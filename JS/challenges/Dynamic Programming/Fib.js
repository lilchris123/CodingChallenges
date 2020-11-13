function Fib(x){
    let results =[];
    let dist= Number.MAX_SAFE_INTEGER;
    if(x==0)
        return 0;
    results[0]=0;
    if(x==1)
        return 1;
    results[1]=1;
    dist--;

    for (let i = 2; i <= x; i++) {
        results[i]= results[i-1]+ results[i-2];
        if(results[i]== x)
            return x;
        else if( dist < Math.abs(x- results[i]))
            return results[i-1];
        else
            dist= Math.abs(x- results[i]);
    }
    return results.pop();
}

console.log(Fib(6));