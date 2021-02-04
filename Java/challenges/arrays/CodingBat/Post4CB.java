package challenges.arrays.CodingBat;
/*
Given a non-empty array of ints, return a new array containing the elements from the original array that come after the last 4 in the original array.
The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.


post4([2, 4, 1, 2]) → [1, 2]
post4([4, 1, 4, 2]) → [2]
post4([4, 4, 1, 2, 3]) → [1, 2, 3]
*/
public class Post4CB {
    public static int[] post4(int[] nums) {
        int fourIdx=0;
        
        for(int i=0; i< nums.length; i++){
          if(nums[i] == 4)
            fourIdx=i;
        }
        int m= fourIdx+1;
        int n=nums.length-m;
        int[] post4= new int[n];
        
        for(int i=0; i<n; i++)
          post4[i]=nums[m+i];
          
        return post4;
      }
      
}
