package challenges.dp;

public class DecodeWays {
    public static int numDecodings(String s) {
        if(s.length() ==0)
            return 0;

        int n= s.length();
        //dp array -> nth pos will have our solution
        int dp[]= new int[n+1];

        //one way
        dp[0]=1;
        //case that first num is a '0' else there is a way
        dp[1]= s.charAt(0) != '0' ? 1 : 0;

        for(int i=2; i <= n; i++){
            //last number
            int lastDigit= Integer.valueOf(s.substring(i-1, i));
            //last 2 numbers (2 digit number)
            int last2Digits= Integer.valueOf(s.substring(i-2, i));

            //if last number is from 1 to 9 thats one way
            if(lastDigit >= 1 && lastDigit <=9)
                dp[i]+= dp[i-1];
            // if last two 2 digit- number is from 10 to 26 thats another way
            if(last2Digits >= 10 && last2Digits <=26)
                dp[i]+= dp[i-2];
        }
        //return number of ways
        return dp[n];
    }
}
