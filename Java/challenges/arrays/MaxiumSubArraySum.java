package challenges.arrays;
/*
The list usually contains both positive and negative numbers along with 0. 
For example, for the array of values −2, 1, −3, 4, −1, 2, 1, −5, 4 the contiguous subarray with the largest sum is 4, −1, 2, 1, with sum 6.
*/
public class MaxiumSubArraySum {
    //O(n^2) brute force approach find sum of all subarray sums, keeping track of max subarray sum
    public static int maxSubArraySumBrute(int[] arr){
        int maxSum=0;

        for(int i=0; i<arr.length; i++){
            int currMaxSum=0;
            for(int j=i; j<arr.length; j++){
                currMaxSum += arr[j];
            }
            maxSum = Math.max(maxSum,currMaxSum);
        }

        return maxSum;
    }

   public static int maxSubArraySum(int[] arr){
        int maxSum= Integer.MAX_VALUE;
        int currMax=0;
        
        for(int i=0; i< arr.length; i++){
            currMax += arr[i];
            if(maxSum < currMax)
                maxSum= currMax;
            else if(currMax < 0)
                currMax=0;
        }

        return maxSum;
    }
}