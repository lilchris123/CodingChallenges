export default class DoublyLinkedListNode {
  constructor(value, next = null, prev = null) {
    this.next = next;
    this.prev = prev;
    this.value = value;
  }

  toString(callback) {
    return callback ? callback(this.value) : `${this.value}`;
  }
}
