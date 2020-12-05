/**
Given an array of time intervals (start, end) for classroom lectures (possibly overlapping), 
find the minimum number of rooms required.
For example, given [(30, 75), (0, 50), (60, 150)], you should return 2.
 */

 function classrooms(lectures){

    let rooms= 0;
    for( let i=0; i< lectures.length; i++){
                if(lecture[1] < room[0] || lecture[0] > room[1])
                    rooms.push(lecture);
        }
    }
    return rooms.length;
 }

 console.log(classrooms([[30, 75], [0, 50], [60, 150]]));