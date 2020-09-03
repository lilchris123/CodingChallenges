//O(n)
function dnaCompliment(dna){
    let compliment= '';
    const table ={
        A: 'T',
        T: 'A',
        C: 'G',
        G: 'C'
    }
    for (let i = 0; i < dna.length; i++) {
        const currentLetter= dna[i];
        compliment += table[currentLetter];
    }

    return compliment;
}

//O(3n)
function dnaCompliment2(dna){
    const table ={
        A: 'T',
        T: 'A',
        C: 'G',
        G: 'C'
    }
    return dna.split('').map((letter)=> table[letter]).join('');
}

console.log(dnaCompliment("GTA"));