import InsertionSort from "../components/InsertionSort";

export default function insertionSort(arr){
    const n=arr.length;

    for(let i=1; i<n; i++){
        let j=i;

        while(j>0 && arr[j] < arr[j-1]){
            let temp= arr[j];
            arr[j]=arr[j-1];
            arr[j-1 ]=temp;
            j--;
        }
    }
    return arr;
}