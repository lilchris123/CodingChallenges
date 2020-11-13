/**
Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

Follow-up: what if you can't use division?

O(n) Space(n) - Division approach
create new arr of size input arr
multiply all the elements and store result
iterate the newArr newArr[i] = result / arr[i]

O(n^2) Space(n) - Naive approach
create new arr of size input arr
for every element iterate the arr multiplying every element skiping the curr element 
then storing that result at newArr[currentIndex]
*/
package challenges.daily;

public class Problem2 {
    public static int[] problem2(int arr[]){

        int newArr[]= new int[arr.length];
        int result=1;

        for(int x: arr)
            result*=x;
        for(int i=0; i< newArr.length; i++){
            newArr[i]=result / arr[i];
        }

        return newArr;
    }

    public static int[] problem2Alt(int arr[]){

        int newArr[]= new int[arr.length];

        
        for(int i=0; i< newArr.length; i++){
            int result=1;
            for(int j=0; j<newArr.length; j++){
                if(i!=j)
                 result *=arr[j];
            }
            newArr[i]= result;
        }

        return newArr;
    }
}