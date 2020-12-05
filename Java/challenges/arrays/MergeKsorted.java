package challenges.arrays;

import java.util.*;

/** sorted merged list from K sorted lists
 return a new sorted merged list from K sorted lists, each with size N.
 */
public class MergeKsorted {
    // O(KN log(k)) 
    public static int[] mergeKarrays(int arrs[][]){
        int k_pos[]= new int[arrs.length];
        int result[]= new int[arrs.length * arrs.length];

        for(int i=0; i<result.length; i++){
            int smallest=Integer.MAX_VALUE;
            int k_smallest=0;
            for(int k=0; k<arrs.length; k++){
                if(arrs[k].length <= k_pos[k])
                    continue;
                else if(arrs[k][k_pos[k]]< smallest){
                    smallest = arrs[k][k_pos[k]];
                    k_smallest=k;
                }
            }
            result[i]=smallest;
            k_pos[k_smallest]++;
        }
        return result;
    }
    //O(KN Log(KN))
    public static Integer[] bruteforce(int arrs[][]){
        List<Integer> result= new ArrayList<Integer>();
        for(int row=0; row < arrs.length; row++){
            for(int col=0; col < arrs.length; col++){
                result.add(arrs[row][col]);
            }
        }
        Collections.sort(result);
        return result.toArray(new Integer[result.size()]);
    }
}
