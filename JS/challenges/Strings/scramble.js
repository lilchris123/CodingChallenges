function scramble(scrambled, word){
    //create a map to track all letters from the scrambled word
    let lookup={};

    scrambled.split('').forEach(letter => {
        if(lookup[letter])
            lookup[letter]++;
        else
            lookup[letter]=1;
    });

    //iterate the word
    for(let i=0; i<word.length; i++){
        const currentLetter= word[i];
        //if current letter is > 0 in lookup decrement it
        if(lookup[currentLetter] && lookup[currentLetter]>0)
            lookup[currentLetter]--;
        //else return false;
        else
            return false;
    }
    //return true;
    return true;
}

console.log(scramble("lloeh","hello"));
