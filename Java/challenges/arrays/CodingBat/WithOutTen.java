package challenges.arrays.CodingBat;

public class WithOutTen {
    public static int[] withoutTen(int[] nums) {
        int[] res= new int[nums.length];
        int i=0;
        for(int x: nums){
          if(x != 10){
            res[i]=x;
            i++;
          }
        }
        return res;
        
        // for(int i=0; i< nums.length; i++){
        //   if(nums[i]==10){
        //     nums[i]=0;
        //   }
        // }
        // for(int i=0; i< nums.length; i++){
        //     if(nums[i]==0){
        //       swap(nums,i,(nums.length-1));
        //       empties++;
        //     }
        // }
    }
}
