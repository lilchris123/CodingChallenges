/*
Sum of two lowest positive integers
O(n) linear time complexity
*/
function sumTwoSmallestNumbers(numbers){
    //hold smallest number set to big number
    let smallest= Number.MAX_VALUE
    //hold second smallest number set to big number
    let secondSmallest= Number.MAX_VALUE
    //iterate the array
    for (let i = 0; i < numbers.length; i++) {
        //if encounter a number smaller then the smallest
        if(secondSmallest >= numbers[i]){
            //set second smallest to smallest and smallest to the encountered number
            if(smallest > numbers[i]){
                secondSmallest=smallest;
                smallest=numbers[i];
            }
            else
                secondSmallest=numbers[i];
        }
    }
    
    //return the sum of smallest and 2nd smallest
    return smallest+ secondSmallest;
}
// Sort solution O(n log(n))
function sumTwoSmallestNumbers2(numbers) {
    numbers.sort((a,b)=> a - b);
    return numbers[0]+numbers[1];
}

//Brute force approach 0(n^2)
function sumTwoSmallestNumbers3(numbers) {
  //track the minimum sum of pairs
  let minSum = Number.MAX_VALUE;
  //iterate the list of numbers
  for (let i = 0; i < numbers.length; i++) {
    //hold current minimun sum
    let currMinSum = Number.MAX_VALUE;
    //iterate from current num to find the lowest pair sum
    for (let j = i + 1; j < numbers.length; j++) {
      //add pairs for current sum
      if (currMinSum > numbers[i] + numbers[j])
        currMinSum = numbers[i] + numbers[j];
    }
    //if current min sum is lower than the minSum then set it to minSum
    if (currMinSum < minSum) minSum = currMinSum;
  }
  //return minSum
  return minSum;
}

console.log(sumTwoSmallestNumbers([3, 87, 45, 12, 7 ]));
