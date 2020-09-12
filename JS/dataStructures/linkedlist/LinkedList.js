import LinkedListNode from "./LinkedListNode";

export default class LinkedList {
  constructor() {
    /** @var LinkedListNode */
    this.head = null;

    /** @var LinkedListNode */
    this.tail = null;
  }
  /**
   * @param {*} value
   * @return {LinkedList}
   */
  prepend(value) {
    let node = new LinkedListNode(value, this.head);
    if (this.head == null) {
      this.head = node;
      this.tail = node;
    } else {
      this.head = node;
    }
    return this;
  }

  /**
   * @param {*} value
   * @return {LinkedList}
   */
  append(value) {
    let newNode = new LinkedListNode(value);
    if (this.head == null) {
      this.head = newNode;
      this.tail = newNode;
    } else this.tail.next = newNode;
    this.tail = newNode;

    return this;
  }

  /**
   * @param {*} value
   * @return {LinkedListNode}
   */
  delete(value) {
    if (!this.head) return null;

    let deletedNode = null;

    while (this.head && this.head.value === value) {
      deletedNode = this.head;
      this.head = this.head.next;
    }

    let currNode = this.head;
    if (currNode !== null) {
      while (currNode.next) {
        if (currNode.next.value === value) {
          deletedNode = currNode.next;
          currNode.next = currNode.next.next;
        } else currNode = currNode.next;
      }
    }
    if (this.tail.value === value) this.tail = currNode;

    return deletedNode;
  }

  /**
   * @return {LinkedListNode}
   */
  deleteHead() {
    if (!this.head) return null;
    let deletedNode = this.head;
    this.head = this.head.next;
    return deletedNode;
  }
  /**
   * @param {*} value
   * @return {LinkedListNode}
   */
  find(value) {
    let currNode = this.head;

    while (currNode) {
      if (currNode.value === value) return currNode;
      currNode = currNode.next;
    }
    return null;
  }
  /**
   * @return {LinkedListNode[]}
   */
  toArray() {
    const nodes = [];
    let currNode = this.head;

    while(currNode) {
      nodes.push(currNode);
      currNode = currNode.next;
    }
    return nodes;
  }

  /**
   * @param {function} [callback]
   * @return {string}
   */
  toString(callback) {
    return this.toArray()
      .map((node) => node.toString(callback))
      .toString();
  }
  // 2 -> 5 -> 7 -> null      prev= null curr= 2 next = 5
  // null <- 2  5-> 7 -> null prev= 2 curr =5 next = 7
  // null <- 2 <- 5 7-> null  prev= 5 curr =7 next = null
  // null <- 2 <- 5 <- 7      prev= 5 curr =7 next = null
  reverse() {
    if (this.head == null) return this;
    this.tail = this.head;
    let prevNode = null;
    let currNode = this.head;
    let nextNode = this.head.next;

    while (nextNode) {
      currNode.next = prevNode;
      prevNode = currNode;
      currNode = nextNode;
      nextNode = nextNode.next;
    }

    currNode.next = prevNode;
    this.head = currNode;
    return this;
  }
}
