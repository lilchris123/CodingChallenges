
function listFiltering(list){
   return list.filter(item => typeof item === 'number') ;
}

console.log(listFiltering([1,2,'a','b','5']));