function stringCompression(str){
    let result= "";
    let idx=0;
    while(idx <str.length){
        let i=1;
        while((idx + i < str.length) && str[idx] == str[idx+i])
            i++;
        if(i>1)
            result+=str[idx]+""+i;
        else   
            result+=str[idx];
        idx+=i;
    }
    return result;
}

console.log(stringCompression("cchrrisssss"));
console.log(stringCompression("Donnnny"));
console.log(stringCompression("ddodd"));