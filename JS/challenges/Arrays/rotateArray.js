/*
Given an array, rotate the array to the right by k steps, where k is non-negative.
Inplace
*/
// O(k*n)= O(n)
function rotateRight(nums, k) {
  let last = nums.length - 1;
    k %= nums.length; //pervents a full rotation- optimizes solution
  while (k) {
    for (let j = 0; j < last; j++) {
      swap(nums, j, last);
    }
    k--;
  }
}

//Given an array, rotate the array to the left by k steps, where k is non-negative.
// O(k*n)= O(n)
function rotateLeft(nums, k) {
  let first = 0;
    k %= nums.length; //pervents a full rotation- optimizes solution
  while (k) {
    for (let i = nums.length - 1; i > 0; i--) {
      swap(nums, i, first);
    }
    k--;
  }
}

function swap(arr, a, b) {
  let tmp = arr[a];
  arr[a] = arr[b];
  arr[b] = tmp;
}

let nums = [1, 2, 3];
console.log(nums);
rotateLeft(nums, 4);
console.log(nums);
