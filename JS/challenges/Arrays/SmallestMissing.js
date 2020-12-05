function smallestMissing(A){
    let set= new Set();

    for(let x of A){
        set.add(x);
    }

    for(let i=1; i <= A.length; i++){
        if(!set.has(i))
            return i;
    }
    return A.length+1;
}

console.log(smallestMissing([-1,-3]));