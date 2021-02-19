package challenges.arrays.CodingBat;
/**
Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.


haveThree([3, 1, 3, 1, 3]) → true
haveThree([3, 1, 3, 3]) → false
haveThree([3, 4, 3, 3, 4]) → false
 */
public class havingThree {
    public boolean haveThree(int[] nums) {
        int cnt=0;
        int len= nums.length;
        
        if(len< 5) return false;
        
        for(int i=0; i< len; i++){
          if(i>0 && i< len-1 && nums[i] ==3){
            if(nums[i-1] != 3 && nums[i+1]!=3)
              cnt++;
          }
          else if(i==0 && nums[i] ==3 && nums[i+1] != 3)
            cnt++;
          else if(i==len-1 && nums[i] ==3 && nums[i-1] != 3)
            cnt++;
            
        }
        return cnt ==3;
      }
}
