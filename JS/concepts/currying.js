// Currying - function returns inner defined function
function Greet(a){
    return function(b){
        return `${a} ${b}`;
    }
}
//ES6 Curring
let GreetES6 = (a) => (b)=> `${a} ${b}`;

let hello= Greet("Hello");
console.log(hello('chris'));
//Hello chris

console.log(Greet('welcome')('john'));
//welcom john
console.log(GreetES6('welcome')('chris'));
//welcome chris
