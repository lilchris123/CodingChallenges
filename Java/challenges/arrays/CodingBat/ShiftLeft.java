package challenges.arrays.CodingBat;

public class ShiftLeft {
    public static int[] shiftLeft(int[] nums) {
        for(int i=nums.length-1; i>=0; i--){
          swap(nums,0, i);
        }
        return nums;
      }
      static void swap(int[] nums, int a, int b){
        int temp= nums[a];
        nums[a]=nums[b];
        nums[b]= temp;
      }
}
