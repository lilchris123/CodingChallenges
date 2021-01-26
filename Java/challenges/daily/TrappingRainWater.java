package challenges.daily;
/*
Given an array of non-negative integers representing terraces in an elevation map where the width of each bar is 1, 
compute how much water it is able to trap after raining.

Input: arr[] = [3, 0, 0, 2, 0, 4]
Output: 10
Structure is like below:

     |
|    |
|  | |
|__|_| 

We can trap "3*2 units" of water between 3 an 2,
"1 unit" on top of bar 2 and "3 units" between 2 
and 4. See below diagram also.

Input: arr[] = [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]
Output: 6
Structure is like below:

       | 
   |   || |
_|_||_||||||

Trap "1 unit" between first 1 and 2, "4 units" between
first 2 and 3 and "1 unit" between second last 1 and last 2.
*/

public class TrappingRainWater {
    //Brute force approach
    public static int brute(int[] h){
        int waterAmount=0;

        for(int i=0;i< h.length; i++){
            int max_left=0;
            int max_right=0;

            // Get left most high terrace.
            for(int j= i-1; j>=0; j--){
               max_left= Math.max(max_left,  h[j]);
            }

            // Get right most high terrace.
            for(int j=i+1; j< h.length; j++){
               max_right= Math.max(max_right, h[j]);
            }
            int wallBoundryHeight= Math.min(max_left,max_right);
            if(wallBoundryHeight > h[i])
                waterAmount+= wallBoundryHeight - h[i];
        }
        return waterAmount;
    }
}
