//wrong implementation
function trappingRain(arr) {
  let highest = -1;
  let secHighest = -1;

  //find highest and second highest walls
  for (let i = 0; i < arr.length; i++) {
    if (secHighest ==-1 || arr[i] > arr[secHighest]) {
      if (highest ==-1 || arr[i] > arr[highest]) {
        secHighest = highest;
        highest = i;
      }
      else
        secHighest = i;
    }
    console.log("iteration", i);
    console.log("1st wall",arr[highest])
    console.log("2nd wall",arr[secHighest])
    console.log();
  }

  // get accumelated water
  let total = 0;

  if (secHighest < highest)
    for (let i = secHighest + 1; i < highest; i++) {
      total += arr[secHighest] - arr[i];
    }
  else
    for (let i = highest + 1; i < secHighest; i++) {
      total += arr[secHighest] - arr[i];
    }
  return total;
}
