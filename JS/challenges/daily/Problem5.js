/*
cons(a, b) constructs a pair, and car(pair) and cdr(pair) returns the first and last element of that pair.
For example, car(cons(3, 4)) returns 3, and cdr(cons(3, 4)) returns 4.
 */

// constructs pair
function cons(a,b){
    return [a,b];
}

// returns first element of pair
function car(pair){
    return pair[0];
}

// returns last element of pair
function cdr(pair){
    return pair[1];
}
console.log(car(cons(5,6)));
console.log(cdr(cons(5,6)))