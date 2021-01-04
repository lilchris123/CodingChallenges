/**
Given an array of time intervals (start, end) for classroom lectures (possibly overlapping), 
find the minimum number of rooms required.
For example, given [(30, 75), (0, 50), (60, 150)], you should return 2.
 */

 function classrooms(lectures){
    if(lectures.length ==0) return 0;

    let rooms= 1;
    for( let i=0; i< lectures.length; i++){
        for(let j=0; j<= i; j++){
            if(i == j) continue;
            if(!(lectures[i][1] < lectures[j][0] || lectures[i][0] > lectures[j][1])){
                rooms++;
                break;
            }

        }
    }
    return rooms;
 }

 console.log(classrooms([[30, 75], [0, 50], [60, 150]]));