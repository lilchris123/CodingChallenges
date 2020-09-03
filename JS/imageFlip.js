/**
 * @param {number[][]} A
 * @return {number[][]}
 */

/*
[1,1,0]
[1,0,1]
[0,0,0]
*/
function imageFlip(A){
    /*  1) create result matrix
        1) iterate the rows
            2) reverse the rows
        3)
    */
let res= new Array(A.length);

for(let i=0; i< A.length; i++){
   res[i] =A[i].reverse();
}
for(let i=0; i< A.length; i++){
    res[i] =A[i].map((e)=> e ? 0 :1);
 }
return res;
}

console.log(imageFlip([[1,1,0],[1,0,1],[0,0,0]]));