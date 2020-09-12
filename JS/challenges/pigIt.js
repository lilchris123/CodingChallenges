//reverse every word 
//and cut the first letter of the word and add it to the back
//and append "ay" to it

function pigIt(str){
    return str.split(' ').map(word => word.slice(1) + word[0] + "ay");
}

console.log(pigIt("Hello World"));