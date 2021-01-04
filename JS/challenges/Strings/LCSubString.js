/*
    Longest Common Substring
    Given two strings ‘X’ and ‘Y’, find the length of the longest common substring.

    Input : X = “GeeksforGeeks”, y = “GeeksQuiz”
    Output : 5
    The longest common substring is “Geeks” and is of length 5.

    Input : X = “abcdxyz”, y = “xyzabcd”
    Output : 4
    The longest common substring is “abcd” and is of length 4.

    Input : X = “zxabcdezy”, y = “yzabcdezx”
    Output : 6
    The longest common substring is “abcdez” and is of length 6.
*/
function LCSubstr(a,b){
    let maxLen="";
    for(let i=0; i<a.length; i++){
        for(let j=i+1; j<=a.length; j++){
            //Curr substring of string a
            let currSubstr= a.slice(i,j);

            //check if current substring is in string b
            for(let k=0; k+currSubstr.length <= b.length; k++){
            
                if(currSubstr == b.substr(k,currSubstr.length)){
                    //if it is and is longer, set it to our new max
                    if(currSubstr.length > maxLen.length)
                        maxLen= currSubstr;
                }
            }
        }
    }
    return maxLen;
}

console.log(LCSubstr("GEEKS","GEEKSFORGEEKS"));