function createPhoneNumber2(numbers){
    const phoneNumber= numbers.join('');
    const areaCode= `(${phoneNumber.slice(0,3)})`;
    const firstPart= phoneNumber.slice(3,6);
    const secondPart= phoneNumber.slice(6,10);

    return `${areaCode} ${firstPart}-${secondPart}`;
}

function createPhoneNumber(numbers){
    const phone= numbers.join('');
    return `(${phone.slice(0,3)}) ${phone.slice(3,6)}-${phone.slice(6,10)}`;
}

function createPhoneNumber3(numbers){
    let phoneFormat= '(xxx) xxx-xxxx';
    for(let x of numbers)
        phoneFormat=phoneFormat.replace('x',x);
    return phoneFormat;
}


console.log(createPhoneNumber3([1, 2, 3, 4, 5, 6, 7, 8, 9, 0]));