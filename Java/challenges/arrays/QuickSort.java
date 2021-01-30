package challenges.arrays;

public class QuickSort {

    public static void quickSort(int[] arr, int l, int r){
        if(l< r){
            int pivotIdx= partition(arr, l, r);

            quickSort(arr, l, pivotIdx-1);
            quickSort(arr, pivotIdx+1, r);
        }

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
