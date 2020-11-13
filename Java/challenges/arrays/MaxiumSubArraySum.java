package challenges.arrays;

public class MaxiumSubArraySum {
   public static int maxSubArraySum(int[] arr){
        int maxSum= Integer.MAX_VALUE;
        int currMax=0;
        for(int i=0; i< arr.length; i++){
            currMax= currMax + arr[i];
            if(maxSum < currMax)
                maxSum= currMax;
            else if(currMax < 0)
                currMax=0;
        }

        return maxSum;
    }
}