package challenges.sorting;

public class MergeSort {
    public static void mergeSort(int[] arr, int l, int r){
        if(l<r){
        //middle pointer
        int m= (r+l)/2;

        // sort left side of middle pointer
        mergeSort(arr,l,m);
        // sort right side of middle pointer
        mergeSort(arr,m+1,r);

        // merge left subarray and right subarray
        merge(arr,l,m,r);
        }
    }
    static void merge(int[] arr, int l, int m, int r){
        int n1= m-l+1;
        int n2= r-m;

        int[] a1= new int[n1];
        int[] a2= new int[n2];

        for(int i=0; i<n1; i++){
            a1[i]=arr[l+i];
        }
        for(int i=0; i<n2; i++){
            a2[i]=arr[m+1+i];
        }

        int i=0, j=0, k=l;
        while(i<n1 && j<n2){
            if(a1[i]<=a2[j]){
                arr[k]=a1[i];
                i++;
            }
            else{
                arr[k]=a2[j];
                j++;
            }
            k++;
        }

        while(i< n1){
            arr[k]=a1[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=a2[j];
            j++;
            k++;
        }
    }
}
