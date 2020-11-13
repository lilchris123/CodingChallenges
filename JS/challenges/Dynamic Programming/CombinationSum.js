function combinationSum(nums, target){
    // dp array stores the possible combination sum count for 1 to target
    let dp=new Array(target+1).fill(0);
    //only one way to make sum of 0
    dp[0]=1;

    // Loop through 1 to target for each candidate contribution with different sequence
    for(let i=1; i <= target; i++){
        for(let c of nums){ // set contribution of each candidate for current value
            if(i>=c) dp[i] += dp[i-c];
        }
    }

    return dp[target];
}

console.log(combinationSum([1,2,3], 4));