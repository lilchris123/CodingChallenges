package challenges.arrays.CodingBat;
/*
Return an array that contains the exact same numbers as the given array, 
but rearranged so that all the even numbers come before all the odd numbers. 
Other than that, the numbers can be in any order. You may modify and return the given array, 
or make a new array.


evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
evenOdd([3, 3, 2]) → [2, 3, 3]
evenOdd([2, 2, 2]) → [2, 2, 2]
*/
public class evenOddCB {
    // creating evens and odd arrays
    public static int[] evenOdd(int[] nums) {
        int evenCnt=0;
        int oddCnt=0;
        
        for(int x: nums){
          if(x%2 ==0)
            evenCnt++;
          else
           oddCnt++;
        }
        int[] evens= new int[evenCnt];
        int[] odds= new int[oddCnt];
        
        int idx1=0;
        int idx2=0;
        for(int x: nums){
          if(x%2 ==0){
            evens[idx1]=x;
            idx1++;
          }
          else{
            odds[idx2]=x;
            idx2++;
          }
        }
        
        int[] res= new int[nums.length];
        int i=0;
        while(i<evens.length){
          res[i]=evens[i];
          i++;
        }
        i=evens.length;
        while(i<res.length){
          res[i]=odds[i-evens.length];
          i++;
        }
        return res;
        
      }
}
