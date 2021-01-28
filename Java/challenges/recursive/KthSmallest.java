package challenges.recursive;

public class KthSmallest {

    //O(n^2) worst case, but expected O(n)
    public static int kthSmallest(int[] arr, int l, int r, int k){
        //base case arr size of one
        if(l == r) return arr[l];
        // partion array to 2 sides left and right, where (Left side < arr[pivot] < Right side)
        // returns the pivot index
        int pivotIdx= partition(arr,l,r);

        // if pivot Index == kth position, we found kth smallest return the value
        if (pivotIdx == k) return arr[pivotIdx];

        // else if pivot < k then, we recursively search for kth smallest in right subarray
        else if( pivotIdx < k)
            return kthSmallest(arr, pivotIdx +1, r, k);
        
        // else pivot > k then, we recursively search for kth smallest in left subarray
        else
           return kthSmallest(arr, l, pivotIdx -1, k);
    }

    static int partition(int[] arr, int l, int r){
        int pivot= arr[r], pivotLoc= l;

        for(int i= l; i<=r; i++){
            if(arr[i]< pivot){
                swap(arr,i,pivotLoc);
                pivotLoc++;
            }
        }
        swap(arr, r, pivotLoc);
        return pivotLoc;
    }

    static int[] swap(int []arr, int i, int j) 
    { 
        int temp = arr[i]; 
        arr[i] = arr[j]; 
        arr[j] = temp; 
        return arr; 
    } 
}
