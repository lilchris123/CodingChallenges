export default function mergeSort(arr) {
  if (arr.length <= 1) {
    return arr;
  }

  const mid = Math.floor(arr.length / 2);
  const left = arr.slice(0, mid);
  const right = arr.slice(mid);
  
  return  merge(mergeSort(left), mergeSort(right));
}

function merge(left, right) {
  let sorted = [];

  let l = 0;
  let r = 0;

  while (l < left.length && r < right.length) {
    if (left[l] < right[r]) {
      sorted.push(left[l]);
      l++;
    } else {
      sorted.push(right[r]);
      r++;
    }
  }

  while (l < left.length) {
    sorted.push(left[l]);
    l++;
  }

  while (r < right.length) {
    sorted.push(right[r]);
    r++;
  }

  return sorted;
}
