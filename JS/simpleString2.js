//Simple string reversal II
//In this Kata, you will be given a string and two indexes (a and b). Your task is to reverse the portion of that string between those two indices inclusive.
function simpleString2(st,a,b){
    let result= st.split('');
    let revStr=st.substring(a,b+1).split('').reverse().join('');

    for (let index = 0; index < revStr.length; index++)
        result[a+index]=revStr[index];
    return result.join('');
}

console.log(simpleString2('cODEWArs',1,5));
