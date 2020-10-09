/*
In computer science, binary search, also known as half-interval search, logarithmic search, or binary chop, is a search algorithm that finds the position of a target value within a sorted array. 
Binary search compares the target value to the middle element of the array; if they are unequal, the half in which the target cannot lie is eliminated and the search continues on the remaining half until it is successful.
If the search ends with the remaining half being empty, the target is not in the array.
 */
function binarySearch(arr, target) {
  let start = 0;
  let end = arr.length - 1;

  while (start <= end) {
    let mid = start + Math.floor((end - start) / 2);

    if (arr[mid] === target) {
      return mid;
    }
    if (arr[mid] > target) {
      end = mid - 1;
    } else if (arr[mid] < target) {
      start = mid + 1;
    }
  }
  return -1;
}

console.log(binarySearch([1, 3, 6, 8, 9], 8));
