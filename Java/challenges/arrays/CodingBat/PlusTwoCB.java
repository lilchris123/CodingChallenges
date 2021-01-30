package challenges.arrays.CodingBat;
/*
Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.


plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
*/
public class PlusTwoCB {
    public static int[] plusTwo(int[] a, int[] b) {
        int[] arr= new int[a.length+b.length];
        int i=0;
        for(int x: a){
          arr[i]=x;
          i++;
        }
        for(int x: b){
          arr[i]=x;
          i++;
        }
        return arr;
    }
      
}
