/*
The power set of a set is the set of all its subsets. Write a function that, given a set, generates its power set.

For example, given the set {1, 2, 3}, it should return {{}, {1}, {2}, {3}, {1, 2}, {1, 3}, {2, 3}, {1, 2, 3}}.

You may also use a list or array to represent a set.
*/
// O(2^n * 2^n) = O(2^2n) = O(2^n)
function powerSet(set){
    let setSize= 1 << set.length // same as Math.pow(2,set.length)
    let subsets= [];

    /*Run from  000..0 to 111..1*/
    for(let i=0; i < setSize; i++){
        let subset= [];
        //current subset
        for(let j=0; j < setSize; j++){
            //check if jth bit in i is true/set
            //print jth element in set
            if(i & (1 << j))
                subset.push(set[j]);
        }
        subsets.push(subset);
    }
    return subsets;
}

console.log(powerSet([1,2,3,5]));

//console.log(5 & (1<<3));