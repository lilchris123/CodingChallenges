package challenges.daily;
import java.util.Arrays;

/* Daily Coding Problem #69 Easy
This problem was asked by Facebook.

Given a list of integers, return the largest product that can be made by multiplying any three integers.
For example, if the list is [-10, -10, 5, 2], we should return 500, since that's -10 * -10 * 5.
-10 -10 -7 0 2 5 8
-1 -1 0 2 5 9

algo
1) sort the list
2) if the product of the first 2 numbers is > than product of last 2
    return product of first two numbers * the last number
3) else return the product of the last 3 numbers
*/

public class LargestProduct69 {
    //O(NLogN)
    public static int largestProduct(int arr[]){
        int len= arr.length;
        Arrays.sort(arr);
        
        //product of the first 2 numbers is > than product of last 2 numbers
        if( arr[0] * arr[1] > arr[len-1] * arr[len-2])
            return arr[0] * arr[1] * arr[arr.length-1];

        return arr[len-3] * arr[len-2] * arr[len-1];
    }
    
}
