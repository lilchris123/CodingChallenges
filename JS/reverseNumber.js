/**
 * @param {number} x
 * @return {number}
 */
var rev = function(x) {
    let rev = 0;
    while(x > 0){
        //pop least significant number with % 10
        let pop =x %10;
        x/=10;
        x=Math.floor(x);
    
        if(rev > Number.MAX_VALUE/10 || (rev == Number.MAX_VALUE / 10 && pop > 7)) return 0;
        if (rev < Number.MIN_VALUE/10 || (rev == Number.MIN_VALUE / 10 && pop < -8)) return 0;
        //push number to rev number
        rev= rev* 10 + pop;
    }
    return rev;
};

console.log(rev(34923742));