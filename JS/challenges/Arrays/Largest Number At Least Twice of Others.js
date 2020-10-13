/**
 * 747. Largest Number At Least Twice of Others -leetcode
 In a given integer array nums, there is always exactly one largest element.
 Find whether the largest element in the array is at least twice as much as every other number in the array.
 If it is, return the index of the largest element, otherwise return -1.
 */

 /** O(n Log(n)) Space(n)
 * @param {number[]} nums
 * @return {number}
 */
var dominantIndex = function(nums) {
    let map= new Map();
    if(nums.length == 1)
        return 0;
    
    for(let i=0; i<nums.length; i++){
        map.set(nums[i],i);
    }
    sorted=nums.sort((a,b) => b-a);
 
    if(sorted[0] >= sorted[1]*2)
        return map.get(sorted[0]);
    return -1;
    
};