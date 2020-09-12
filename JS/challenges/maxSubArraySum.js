/*
Max sub array sum
Given an integer array arr, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
*/

const maxSubArrSum= (arr) =>{
    // initialize maxSum =0
    let maxSum=-2147483647;

    // iterate from 0 to end of array i
    for(let i=0; i< arr.length; i++){
    //iterate from i to end of array j
        for(let j=i; j<arr.length; j++){
        //store currSum of subarray
            let currSum=0;
        //iterate i to j
            for(let k=i; k<=j; k++){
                //sum all numbers
                currSum+=arr[k];
            }
            //if currSum > maxSum
                // set maxSum to currSum
            if(currSum > maxSum){
                maxSum=currSum;
            }
        }
    }
    
    //return maxSum
    return maxSum;
}

console.log(maxSubArrSum([-1,3,-1,8,2]));