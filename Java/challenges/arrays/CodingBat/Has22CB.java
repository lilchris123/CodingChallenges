package challenges.arrays.CodingBat;
/*
Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.

has22([1, 2, 2]) → true
has22([1, 2, 1, 2]) → false
has22([2, 1, 2]) → false
*/
public class Has22CB {
    public static boolean has22(int[] nums) {
        if(nums.length <2) return false;
        
        for(int i=1; i<nums.length; i++){
          if(nums[i] == 2 && nums[i-1]==2)
            return true;
        }
        return false;
      }
}
