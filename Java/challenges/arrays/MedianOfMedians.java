package challenges.arrays;
import java.util.*;

public class MedianOfMedians 
{ 
  
// int partition(int arr[], int l, int r, int k); 
  
// A simple function to find median of arr[]. This is called 
// only for an array of size 5 in this program. 
public static int findMedian(int arr[], int i,int n) 
{ 
   int median= findMedianUtil(arr, (arr.length)/2+1, 0, arr.length-1);
   return median;
} 

static int findMedianUtil(int[] arr, int k, int low, int high){
   int m= partition(arr, low, high);
   int len = m-low +1;

   if(len == k ){
       return arr[m];
   }
   if(len > k){
       return findMedianUtil(arr, k, low, m-1);
   }
   else
    return findMedianUtil(arr, k-len, m+1, high);
}


static int partition(int[] arr, int low, int high){

   int pivot= getPivot(arr, low, high);
   while(low <high){

       while(arr[low] < pivot)
            low++;
       while(arr[high] >pivot)
            high--;

        if(arr[low] == arr[high])
            low++;

        else if(low < high){
            swap(arr,low,high);
        }
   }
   return high;
}
static int getPivot(int[] arr, int low, int high){
    if(high - low+1 <= 9){
        Arrays.sort(arr);
        return arr[arr.length/2];
    }

    int[] temp= null;
    int[] medians= new int[(int)Math.ceil((double)(high-low)/5)];
    int medianIdx=0;

    while(high >= low){
        temp = new int[Math.min(5,high-low+1)];
        for(int i=0; i< temp.length && low <= high; i++){
            temp[i]= arr[low];
            low++;
        }
        Arrays.sort(temp);
        medians[medianIdx]= temp[temp.length/2];
        medianIdx++;
    }
    return getPivot(medians, 0, medians.length-1);
}

  
static int[] swap(int []arr, int i, int j) 
{ 
    int temp = arr[i]; 
    arr[i] = arr[j]; 
    arr[j] = temp; 
    return arr; 
} 
 
}