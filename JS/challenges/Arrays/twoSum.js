/** O(n) Space: O(n)
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
function twoSum(nums, target){
    //1) create a lookup obj for each element in nums array, storing the index
    let numsLookup= {};
    
    nums.forEach((e,i)=>{
        numsLookup[e]=i;
    });
    
    //2) iterate the array
        //3) if target - current element exist and is not current element
            //4) return index array  

    for(let curr=0; curr< nums.length; curr++){
        const lookUp=numsLookup[target- nums[curr]];
        if( lookUp && curr !=lookUp)
            return [curr,lookUp];
    }

    //5) else return empty array
    return [];
}
const twoSumFind =(nums, target)=>{
    for(let i=0; i< nums.length; i++){
       const lookUp= nums.findIndex((e)=> e== target-nums[i]);
       if(lookUp && i != nums[i])
        return [i, lookUp];
    }
}
console.log(twoSumFind([4,4,5], 9));