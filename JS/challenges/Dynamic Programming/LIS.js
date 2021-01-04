/*
Longest Increasing Subsequence
[3,1,8,2,5] -> 3 [1,2,5]
*/

function max(arr){
    if(arr.length ==0) return 0;
    let max= Number.MIN_VALUE;
    for(let x of arr){
        if(x > max)
            max=x;
    }
    return max;
}
//recursion
function LIS_Brute(arr){
    return LIS_Brute(arr,0, 0);
}
function LIS_Brute(arr,start, currpos){
    if(currpos == arr.length-1) return 1;

    LIS_Brute(arr, 0)
}
//Iterative DP approach 0(n^2)
function LIS(arr){
    const n= arr.length;
    let dp =new Array(n+1);

    dp[0]=1;

    for(let i=1; i<=n; i++){
        let subproblems=[];
        for(let k=0; k<i; k++){
            if(arr[k] < arr[i])
                subproblems.push(dp[k]);
        }
        console.log(dp);
        dp[i]= max(subproblems)+1;
    }
    return max(dp);
}

function LIS2(arr){
    const n= arr.length;
    let dp =new Array(n+1);

    dp[0]=1;
    let maxans=0;
    for(let i=1; i<=n; i++){
        let maxval=0;
        for(let k=0; k<i; k++){
            if(arr[k] < arr[i])
                maxval=Math.max(maxval,dp[k]);
        }
        console.log(dp);
        dp[i]= maxval + 1;
        maxans= Math.max(dp[i],maxans);
    }
    return maxans;
}

console.log(LIS_Brute([3,1,8,2,5,6]));