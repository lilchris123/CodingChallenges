/*
- takes 1 min to walk a block
- 10 min walk so 10 blocks
- must end in start position
*/
function tenMinuteWalk(walk){
    //if walk length is not 10 return false
    if(walk.length !== 10) return false;

    //create object keeping track of blocks walked
   const walkTracker={
        'n': 0,
        's': 0,
        'w': 0,
        'e': 0
    }
    //iterate the list
    for (let i = 0; i < walk.length; i++) {
        const walking = walk[i];
        //and increment the directional block walked
        walkTracker[walking]++;
    }
    
    //if n -s blocks and w-e blocks are equal 
    //we are in starting position, return true
    if(walkTracker.n === walkTracker.s && walkTracker.w ===walkTracker.e)
        return true;
    //else return false
    return false;
        
}
console.log(tenMinuteWalk(['n','s','n','s','n','s','n','s','n','s']));