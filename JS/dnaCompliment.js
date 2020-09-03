function dnaCompliment(dna){
    const table ={
        A: 'T',
        T: 'A',
        C: 'G',
        G: 'C'
    }
    return dna.split('').map((letter)=> table[letter]).join('');
}

console.log(dnaCompliment("GTA"));