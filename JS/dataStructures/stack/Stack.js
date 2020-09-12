import { default as LinkedList } from "../linkedlist/LinkedList";

export default class Stack {
    constructor(){
        this.stack= new LinkedList();
    }
    /**
     * @return {boolean} 
     */
    isEmpty(){
       return !this.stack.head;
    }
    /**
     * @param {*} value 
     */
    push(value){
        this.stack.prepend(value);
    }
    /**
     * @return {*}
     */
    pop(){
       const removedHead = this.stack.deleteHead();
       return removedHead ? removedHead.value : null;
    }
    /**
     * @return {*}
     */
    peek(){
        return this.stack.head ? this.stack.head.value : null;
    }
    /**
     * @return {*[]}
     */
    toArray(){
        return this.stack.toArray().map(node => node.value);
    }
    /**
     * @return {string}
     */
    toString(){
        return this.stack.toString();
    }
}
