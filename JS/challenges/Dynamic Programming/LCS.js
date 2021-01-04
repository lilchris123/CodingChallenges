/*
The longest common subsequence problem is to find the longest string (or strings) that is a substring (or are substrings) of two or more strings.
*/

function LCS_DP(a, b){
 let m= a.length;
 let n= b.length;

 let dp= new Array(m+1);
 dp.fill(new Array(n+1).fill(0));


 for(let i=1; i<=m; i++){
     for(j=1; j<=n; j++){
        if(a[i-1] === b[j-1])
            dp[i][j]= dp[i-1][j-1]+1;
        else
            dp[i][j]= Math.max(dp[i-1][j], dp[i][j-1]);
     }
 }

 return dp[m][n];

}

console.log(LCS_DP('AGGTAB','GXTXAYB'));