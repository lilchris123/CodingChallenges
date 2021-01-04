/*This problem was asked by Microsoft.
Given a dictionary of words and a string made up of those words (no spaces), 
return the original sentence in a list. 

If there is more than one possible reconstruction, 
return any of them. 
If there is no possible reconstruction, then return null.

For example, given the set of words 'quick', 'brown', 'the', 'fox', and the string "thequickbrownfox", 
you should return ['the', 'quick', 'brown', 'fox'].

Given the set of words 'bed', 'bath', 'bedbath', 'and', 'beyond', and the string "bedbathandbeyond", 
return either ['bed', 'bath', 'and', 'beyond] or ['bedbath', 'and', 'beyond'].

algo
store results =[]

iterate through string
    check if substring exist in the set
        add it to the results
        remove substring from string 
        set pointer to 0
    else
        increment pointer

*/

// O(n)
function reconstruction(set, str){
    let results= [];
    let i=0;
    while(i <= str.length){
        if(set.has(str.substring(0,i))){
            results.push(str.substring(0,i));
            str= str.slice(i,str.length);
            i=0;
        }
        else
            i++;
    }

    return results.length ? results : null;
}

let set = new Set();
set.add('bed');
set.add('bath');
set.add('bedbath');
set.add('and');
set.add('beyond');


console.log(reconstruction(set,""));