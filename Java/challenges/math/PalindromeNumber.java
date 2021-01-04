package challenges.math;
//Check if a number is a palindrome

//O(n) Math approach -> reverse number with math and compare it to the original
public class PalindromeNumber {
    public static boolean isPalindromicNumber(int n){
        int revNum =0;
        int currNum= n;

        while(currNum > 0){
            revNum *= 10;
            revNum += currNum%10;
            currNum /= 10;
        }
        //System.out.println(revNum + " "+ n);
        return revNum == n ? true : false;
    }
}
