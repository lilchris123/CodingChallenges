function coinChangeMin(coins, amount){
    //dp array to store minimum number of coins to get amount
    let dp= new Array(amount+1).fill(Number.MAX_SAFE_INTEGER);
    //0 coins needed to get amount 0
    dp[0]=0;
        
    for(let i=1; i<=amount; i++){
        for(let c of coins){
            //out of bounce check 
            if(i >= c)
                dp[i] = Math.min(dp[i],dp[i-c]+1);
        }
    }
    // last element in our dp array is the minimun number of coins
    return dp[amount];
}

console.log(coinChangeMin([1,2,4],6));