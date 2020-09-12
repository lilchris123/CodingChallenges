import LinkedList from './dataStructures/linkedlist/LinkedList';
import Stack from './dataStructures/stack/Stack';
import Queue from './dataStructures/queue/Queue';

function linkedListEx(){
let l1 = new LinkedList();
l1.append(10);
l1.append(5);
l1.append(7);
l1.append(1);

console.log(l1.toString());
console.log(l1.reverse().toString());
}

const stackEx =() =>{
    let s= new Stack();
    console.log(s.isEmpty());
    s.push("chris");
    s.push("emily");

    console.log(s.toArray());
}
const queueEx = () => {
    let q= new Queue();
    q.enqueue(5);
    q.enqueue(15);
    q.enqueue(25);
    q.dequeue();

    console.log(q.toString());
}

queueEx();