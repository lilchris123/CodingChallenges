package challenges.arrays.CodingBat;
/*

Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.


modThree([2, 1, 3, 5]) → true
modThree([2, 1, 2, 5]) → false
modThree([2, 4, 2, 5]) → true
*/
public class ModThree {
    public static boolean modThree(int[] nums) {
        int e=0;
        int o=0;
        for(int x : nums){
          if(e ==3 || o ==3) return true;
          if(x%2 == 1){
            o++;
            e=0;
          }
          else if(x%2 ==0){
            e++;
            o=0;
          }
            
        }
        if(e ==3 || o ==3) return true;
        return false;
      }
}
