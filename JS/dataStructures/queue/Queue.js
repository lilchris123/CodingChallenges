import LinkedList from "../linkedlist/LinkedList";

export default class Queue{
    constructor(){
        this.linkedlist= new LinkedList();
    }
    /**
     * @return {boolean} 
     */
    isEmpty(){
        return !this.linkedlist.head;
     }
     /**
      * @param {*} value 
      */
     enqueue(value){
         this.linkedlist.append(value);
     }
     /**
      * @return {*}
      */
     dequeue(){
        const removedHead = this.linkedlist.deleteHead();
        return removedHead ? removedHead.value : null;
     }
     /**
      * @return {*}
      */
     peek(){
         return this.linkedlist.head ? this.linkedlist.head.value : null;
     }
     /**
      * @return {*[]}
      */
     toArray(){
         return this.linkedlist.toArray().map(node => node.value);
     }
     /**
      * @return {string}
      */
     toString(){
         return this.linkedlist.toString();
     }
     /**
      * @param {*} value 
      * @return {LinkedList}
      */
    enqueue(value){
        this.linkedlist.append(value);
    }

}