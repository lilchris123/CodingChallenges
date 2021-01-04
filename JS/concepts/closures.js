// Closure - function within a function using outer function's local variables
let makeCounter= function(){
    let counter= 0;
    function increment(){
        counter++;
    }
    function display(){
        console.log(counter);
    }
    increment();
    display();
}

makeCounter();

function person() {
    let name = 'Peter';
    
    return function displayName() {
      console.log(name);
    };
}
let peter = person();
peter(); // prints 'Peter'  