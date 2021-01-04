function swap(arr, a, b) {
  let temp = arr[b];
  arr[b] = arr[a];
  arr[a] = temp;
}
// 2 5 7 6    -> 5 7 6 2
// 6 5 7 2
// 7 5 6 2
// 5 7 6 2

function deleteElement(arr, idx) {
  for (let i = arr.length - 1; i > idx; i--) {
    swap(arr, idx, i);
  }
}

let arr = [3, 2, 5, 1, 6];
let idx = 0;

console.log(`Initial Array: ${arr}\nTarget: ${idx} Value: ${arr[idx]}\n`);
deleteElement(arr, idx);
console.log(arr);
