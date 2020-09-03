/**
 * @param {number} x
 * @return {number}
 */
var reverse = function(x) {
    let rev =0;
    while(x){
        let pop =x %10;
        x/=10;
        // if(rev > Number.MAX_VALUE/10 || (rev == Number.MAX_VALUE / 10 && pop > 7)) return 0;
        // if (rev < Number.MIN_VALUE/10 || (rev == Number.MIN_VALUE / 10 && pop < -8)) return 0;
        rev= rev* 10 +pop;
    }
};

console.log(reverse(83820));