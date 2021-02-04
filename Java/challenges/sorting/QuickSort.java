package challenges.sorting;

public class QuickSort {
    public static void quickSort(int[] arr, int l, int r){
        if(l<r){
            //partition array to two partitions
            int pivotIdx = partition(arr, l, r);

            quickSort(arr, 0, pivotIdx-1);
            quickSort(arr,pivotIdx+1,r);
        }
    }

    static int partition(int[] arr, int l, int r){

        int pivot= arr[r];
        int low=l, hi= r;

        while(low < hi){
            //while pivot > low element move pointer right
            while(pivot > arr[low])
                low++;
            //while pivot < hi element move pointer left
            while(pivot < arr[hi])
                hi--;

            //if elements are equal inc low pointer
            if(arr[low] == arr[hi])
                low++;

            //swap values placing them in the correct side
            else if(low < hi){
                swap(arr,low,hi);
            }
        }

        //return point of contact which is new pivot index
        return hi;
    }

    static void swap(int[] arr, int a, int b){
        int temp= arr[a];
        arr[a]= arr[b];
        arr[b]= temp;
    }
}
