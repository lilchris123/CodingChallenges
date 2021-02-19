package challenges.arrays.CodingBat;
/*
Given an array of ints, return true if every 2 that appears in the array is next to another 2.


twoTwo([4, 2, 2, 3]) → true
twoTwo([2, 2, 4]) → true
twoTwo([2, 2, 4, 2]) → false
*/

public class TwoTwo {
    public static boolean twoTwo(int[] nums) {
        int len= nums.length;
        //edge case #1
        if(len ==1 && nums[0] ==2) return false;
         
         for(int i=0; i< nums.length; i++){
           //edge case #2 check neighbors of an element of 2
           if(i!=0 && i <nums.length -1 && nums[i]== 2){
             if( nums[i-1] != 2 && nums[i+1] != 2)
               return false;
           }
           //edge case #3 first element is a 2
           else if( i==0 && nums[i]==2 && len >1){
               if(  nums[i+1] != 2)
                 return false;
           }
           //edge case #4 last element is a 2
           else if( i== nums.length-1 && nums[i]==2 && len >1){
               if(  nums[i-1] != 2)
                 return false;
           }
         }
         
         return true;
       }
       
}
