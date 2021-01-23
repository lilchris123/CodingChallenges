package challenges.math;
/*
Given a number check if its a power of 2
*/

public class isPowerOfTwo {

    //O(1) Bit manipulation approach
    // 5 & 4 == 0 true , 5 & 4 ==1 false
    // 101  5           1000  8
    // 100  4           0111  7
    // 001 false        0000  true
    public static boolean sol1(long n){
        if(n == 0) return false;
        return (n & n-1)== 0 ? true : false;
    }

    //O(n) multiplying by 2 approach
    public static boolean sol2(long n){
        if(n == 0) return false;
        if(n <0) n*=-1;
        int i=1;
        while(i<n){
            i*=2;
        }
        return i == n ? true : false;
    }
}
 