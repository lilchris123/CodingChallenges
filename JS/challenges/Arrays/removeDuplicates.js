/*
26. Remove Duplicates from Sorted Array
Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
*/
var removeDuplicates = function(nums) {
    if (nums.length ==0) return 0;
    
    let i =0;
    for(let j=1; j< nums.length; j++){
        if( nums[j] != nums[i]){
            i++;
            nums[i]=nums[j];
        }
    }
    return i+1;
};