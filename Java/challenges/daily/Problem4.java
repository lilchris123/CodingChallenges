package challenges.daily;

public class Problem4 {

    public static int problem4(int[] arr){
  
        int expected= arr[0];
        for(int i=0; i< arr.length; i++){
            if(arr[i] == arr.length && (i != arr.length-1) || arr[i]< 0){
                expected= arr[i+1];
                continue;
            }
           if(expected != arr[i])
            return expected;
            expected++;
        }
        return expected;
    }
}
