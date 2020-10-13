/* 724. Find Pivot Index - Leetcode
 Given an array of integers nums, write a method that returns the "pivot" index of this array.
 We define the pivot index as the index where the sum of all the numbers to the left of the index is equal to the sum of all the numbers to the right of the index.
 If no such index exists, we should return -1. If there are multiple pivot indexes, you should return the left-most pivot index.
 */

 /**
 * @param {number[]} nums
 * @return {number}
 */
var pivotIndex = function(nums) {
    let totalSum=0;
    let sum=0;
    for(let x of nums)
        totalSum+=x;
    
    for(let i=0; i<nums.length; i++){
        totalSum-= nums[i];
        if(sum == totalSum)
            return i;
        sum+=nums[i];
    }
    return -1;
};