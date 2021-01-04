/*
The power set of a set is the set of all its subsets. 
Write a function that, given a set, generates its power set.

Input: Set[], set_size
1. Get the size of power set
    powet_set_size = pow(2, set_size)
2  Loop for counter from 0 to pow_set_size
     (a) Loop for i = 0 to set_size
          (i) If ith bit in counter is set
               Print ith element from set for this subset
     (b) Print separator for subsets i.e., newline
*/
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