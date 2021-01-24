package challenges.dp;
/*
Given an array of non-negative integers, you are initially positioned at the first index of the array. 
Each element in the array represents your maximum jump length at that position.
Determine if you are able to reach the last index.

Input: [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.

Input: [3,2,1,0,4]
Output: false
*/
public class JumpGame {
    //Backtracking Helper
    static boolean btHelper(int idx, int[] arr){
        // reach end index, solution
        if(idx == arr.length-1) return true;
        // no jumps, we fail
        if(arr[idx] == 0) return false;

        boolean result=false;
        //Try possible jumps for each index
        for(int i=1; i <= arr[idx]; i++)
           result= btHelper(idx+i,arr);

        return result;
        
    }
    //O(2^n) Backtracking Recursion approach
    public static boolean backtracking(int[] arr){
        return btHelper(0,arr);
    }
    //Greedy
    public static boolean greedy(int[] arr){
        int n= arr.length;
        int canReach=0;
        for(int i=0; i <= canReach; i++){
            if( i == n-1) 
                return true;
            canReach= Math.max(canReach, i+arr[i]);
        }
        return false;
    }
    
}
