export default function quickSort(arr, start, end) {
  if (start < end) {
    //partition arr so that left of pivot are elements less than pivot
    //and right of it are elements greater than it
    let pIdx = partition(arr, start, end);
    
    //sort part of array left of pivot
    quickSort(arr, start, pIdx - 1);
    //sort part of array right of pivot
    quickSort(arr, pIdx + 1, end);
  }
}

function partition(arr, start, end) {
  //set pivot to the last element
  let pivot = arr[end];
  // set partition index as start
  let pIdx = start;

  for (let i = start; i < arr.length; i++) {
    //swap element if less than pivot
    if (arr[i] < pivot) {
      let temp = arr[i];
      arr[i] = arr[pIdx];
      arr[pIdx] = temp;

      pIdx++;
    }
  }
  //swap pivot with partition index
  let temp = arr[end];
  arr[end] = arr[pIdx];
  arr[pIdx] = temp;

  return pIdx;
}
