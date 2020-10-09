export default function bubbleSort(arr){
    const n= arr.length;
    for(let k=0; k< n-1; k++){
        for(let i=0; i< n-k-1; i++){
            if(arr[i]> arr[i+1]){
                //swap
                let temp= arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }  
    }
    return arr;
}