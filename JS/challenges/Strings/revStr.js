function reverseString(str){
    let rev= ""
    for(let i=str.length-1; i>= 0; i--){
        rev+=str[i];
    }
    return rev;
}
function swap(arr,a,b){
    let tmp = arr[a];
    arr[a]=arr[b];
    arr[b]=tmp;
    return arr;
}
function reverseString2(str){
    let l=0, r=str.length-0;
    let revArr=str.split('');
    while(l<r){
       rev=swap(revArr,l,r);
        l++;
        r--;
    }
    return revArr.join('');
}
console.log(reverseString2("chris"));