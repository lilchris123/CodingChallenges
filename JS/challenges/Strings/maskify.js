function maskify(cc){
    let masked= '';
    for (let i = 0; i < cc.length-4; i++) {
        if(i< cc.length-4)
            masked +='#';
        else
            masked +=cc[i]
    }
    return masked;
}

function maskify2(cardNumbers){
    if(cardNumbers.length <= 4) 
        return cardNumbers;

    let masked= cardNumbers.slice(-4);
    for (let i = 0; i < cardNumbers.length-4; i++) {
        masked='#'+masked;
    }
    return masked;
}

function maskify3(cardNumbers){
    if(cardNumbers.length <= 4) 
        return cardNumbers;

    return cardNumbers.split('').map((ch,i,cardNumbers)=> {
        if(cardNumbers.length-4 > i)
            return '#';
        else
            return ch;
    }).join('');
}

console.log(maskify("888888884039"));