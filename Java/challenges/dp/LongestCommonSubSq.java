package challenges.dp;

public class LongestCommonSubSq {

    static int helper(String text1, int m, String text2, int n, int[][] memo){
        //base case no character before the first character
        if(m == 0 || n == 0){
            return 0;
        }
        // if state already calculated return it
        if(memo[m-1][n-1] != -1)
            return memo[m-1][n-1];

        //if characters are equal inc longest common subsequence count by saving the result and returning it
        if(text1.charAt(m-1) == text2.charAt(n-1)){
            
            memo[m-1][n-1]= 1 + helper(text1, m-1, text2, n-1, memo);
            return memo[m-1][n-1];
        }
        // store results
        memo[m-1][n-1]= Math.max(helper(text1,m-1,text2, n, memo),helper(text1,m,text2, n-1,memo));
        //return longest common subsequence
        return memo[m-1][n-1];
    }

    static int longestCommonSubsequence(String text1, String text2) {
        int m= text1.length();
        int n= text2.length();

        //create our results 2d array 
        int memo[][]= new int[m][n];
        
        //fill table with -1
        for(int i=0; i<text1.length(); i++){
            for(int j=0; j< text2.length(); j++){
                memo[i][j]=-1;
            }
        }

        return helper(text1,m,text2,n, memo);
      }

      static int lcsDP(String X, String Y){
          int m= X.length();
          int n= Y.length();
        
          // create our dp table to save results of sub problems
          int dp[][]= new int[m+1][n+1];

          /* Following steps build dp[m+1][n+1] in bottom up fashion. Note 
         that dp[i][j] contains length of LCS of X[0..i-1] and Y[0..j-1] */
          for(int i=0; i<=m; i++){
              for(int j=0; j<=m; j++){
                if(i ==0 || j==0)
                    dp[i][j]=0;
                else if(X.charAt(i-1)== Y.charAt(j-1))
                    dp[i][j]=1 + dp[i-1][j-1];
                else
                    dp[i][j]= Math.max(dp[i-1][j], dp[i][j-1]);
              }
          }
        return dp[m][n];
      }
}
