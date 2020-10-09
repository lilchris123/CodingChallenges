import DoublyLinkedListNode from "./DoublyLinkedListNode";

export default class DoublyLinkedList {
  constructor() {
    /** @var DoublyLinkedListNode */
    this.head = null;

    /** @var DoublyLinkedListNode */
    this.tail = null;
  }
  /**
   * @param {*} value
   * @return {DoublyLinkedList}
   */
  prepend(value) {
    const newNode = new DoublyLinkedListNode(value, this.head);

    if (this.head) this.head.prev = newNode;

    this.head = newNode;

    if (!this.tail) this.tail = newNode;

    return this;
  }

  /**
   * @param {*} value
   * @return {DoublyLinkedList}
   */
  append(value) {
    const newNode = new DoublyLinkedListNode(value);

    if (!this.head) {
      this.head = newNode;
      this.tail = newNode;
    } else {
      this.tail.next = newNode;
      newNode.prev = this.tail;
      this.tail = newNode;
    }
    return this;
  }

  /**
   * @return {DoublyLinkedListNode}
   */
  deleteHead() {
    if (!this.head) return null;
    const deletedNode = this.head;

    if (this.head.next) {
      this.head = this.head.next;
      this.head.prev = null;
    } else {
      this.head = null;
      this.tail = null;
    }
    return deletedNode;
  }

  /**
   * @param {*} value 
   * @return {DoublyLinkedListNode}
   */
  delete(value) {
    if (!this.head) return null;

    let deletedNode = null;

    while (this.head && this.head.value === value) {
      deletedNode = this.head;
      this.head.prev = null;
      this.head = this.head.next;
    }

    let currNode = this.head;

    while (currNode) {
      if (currNode.value === value) {
        deletedNode = currNode;
        if(!currNode.next)
            currNode.prev.next = null;
        else{
            currNode.prev.next = currNode.next;
            currNode.next.prev = currNode.prev;
        }
      }
      currNode = currNode.next;
    }
    return deletedNode;
  }

  /**
   * @return {DoublyLinkedListNode}
   */
  deleteTail() {
    if (!this.head) {
      return null;
    }
    const deletedNode = this.tail;
    if (this.head === this.tail) {
      this.head = null;
      this.tail = null;
    } else {
      this.tail.prev.next = null;
    }
    return deletedNode;
  }
  /*
  2->5->null   
  null <-2 <-5
    */
  reverse(){
    
    let currNode =this.head;
    let prevNode= null;
    let nextNode= null;

    while(currNode){
        prevNode= currNode.prev;
        nextNode= currNode.next;

        currNode.next=prevNode;
        currNode.prev=nextNode;

        prevNode=currNode; 
        currNode=nextNode;
    }

    this.tail = this.head;
    this.head = prevNode;

    return this;
  }
  /**
   * @return {DoublyLinkedListNode[]}
   */
  toArray(){
    const nodes = [];
    let currNode = this.head;

    while(currNode) {
      nodes.push(currNode);
      currNode = currNode.next;
    }
    return nodes;
  }

  /**
   * @param {function} callback
   * @return {string}
   */
  toString(callback){
    return this.toArray().map(node=> node.toString(callback)).toString();
  }
}
