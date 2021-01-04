package challenges.daily;
/*
There exists a staircase with N steps, and you can climb up either 1 or 2 steps at a time. 
Given N, write a function that returns the number of unique ways you can climb the staircase. 
The order of the steps matters.

For example, if N is 4, then there are 5 unique ways:

1, 1, 1, 1
2, 1, 1
1, 2, 1
1, 1, 2
2, 2

What if, instead of being able to climb 1 or 2 steps at a time, 
you could climb any number from a set of positive integers X? For example, 
if X = {1, 3, 5}, you could climb 1, 3, or 5 steps at a time.
*/
public class StairCase12{

    public static int numWaysClimbX(int n, int[] x){
        int dp[]= new int[n+1];
        dp[0]=1;
        dp[1]=1;


        for(int i =2; i<=n; i++){
            for(int j=0; j < x.length; j++){
                dp[i]+= dp[i-(i<x[j]? 0: x[j])];
            }

        }

        return dp[n];
    }
    //O(n) buttom up approach
    public static int numWaysDP(int n){
        int dp[]= new int[n+1];
        dp[0]=1;
        dp[1]=1;

        for(int i=2; i<=n; i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    //O(2^n) Exponential time Recursive approach;
    public static int numWays(int n){
        if(n==0) return 1;
        if(n==1) return 1;

       return numWays(n-1) + numWays(n-2);

    }
}