package challenges.recursive;

public class Fibonacci {
    //O(n^2)
    public static int fib_Rec(int n){
        if(n<2) return n;
        return fib(n-1)+ fib(n-2);
    }
    
    //O(n)
    public static int fib(int n){
        int dp[]= new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2; i<= n; i++){
            dp[i]= dp[i-1]+ dp[i-2];
        }
        return dp[n];
    }
}