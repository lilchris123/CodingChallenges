package challenges.arrays.CodingBat;
/*
Given an int array of any length, return a new array of its first 2 elements. 
If the array is smaller than length 2, use whatever elements are present.


frontPiece([1, 2, 3]) → [1, 2]
frontPiece([1, 2]) → [1, 2]
frontPiece([1]) → [1]
*/
public class FrontPieceCB {
    public static int[] frontPiece(int[] nums) {
        if(nums.length == 0)
          return new int[0];
          
        if(nums.length <2){
          int[] res= new int[1];
          res[0]=nums[0];
          return res;
        }
        
        int[] res= new int[2];
        
        res[0]=nums[0];
        res[1]=nums[1];
        return res;
      }
}
