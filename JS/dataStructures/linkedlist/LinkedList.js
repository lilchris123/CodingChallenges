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

  static prepend(head, value) {
    const newNode = new LinkedListNode(value, head);
    head = newNode;
    return head;
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

  static append(head, value) {
    let newNode = new LinkedListNode(value);
    if (!head) {
      head.next = newNode;
      return head;
    }
    let curr = head;
    while (curr.next) {
      curr = curr.next;
    }
    curr.next = newNode;
    return head;
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

  static delete(head, value) {
    if (!head) return null;
    if (head.value === value) {
      head = head.next;
      return head;
    }
    let prev = null;
    let curr = head;
    let next = curr.next;

    while (next) {
      if (curr.value === value) {
        prev.next = next;
        return curr;
      }
      prev = curr;
      curr = next;
      next = next.next;
    }
    return null;
  }

  /**
   * @return {LinkedListNode}
   */
  deleteHead() {
    if (!this.head) return null;

    let deletedNode = this.head;
    if (this.head.next) this.head = this.head.next;
    else {
      this.head = null;
      this.tail = null;
    }

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
  static find(head, value){
    if(!head)
      return null;
    while(head){
      if(head.value=== value)
        return head;
      head=head.next;
    }
    return null;
  }
  /**
   * @return {LinkedListNode[]}
   */
  toArray() {
    const nodes = [];
    let currNode = this.head;

    while (currNode) {
      nodes.push(currNode);
      currNode = currNode.next;
    }
    return nodes;
  }

  static toArray(head) {
    const nodes = [];
    let currNode = head;

    while (currNode) {
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
  static toString(head, callback) {
    return LinkedList.toArray(head)
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

  static reversePrint(head,arr){
    if(!head){
      return [];
    }
    this.reversePrint(head.next,arr)
    arr.push(head.value);
    return arr
  }
}
