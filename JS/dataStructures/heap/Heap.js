export default class Heap {
  constructor() {
    if (new.target === Heap) {
      throw new TypeError("Cannot construct Heap instance directly");
    }
    //array representation of the heap
    this.heap = [];
  }

  getParentIndex(childIndex) {
    return Math.floor((childIndex - 1) / 2);
  }

  getLeftChildIndex(parentIndex) {
    return 2 * parentIndex + 1;
  }

  getRightChildIndex(parentIndex) {
    return 2 * parentIndex + 2;
  }

  hasParent(childIndex) {
    return this.getParentIndex(childIndex) > 0;
  }

  hasLeftChild(parentIndex) {
    return this.getLeftChildIndex(parentIndex) > 0;
  }

  hasRightChild(parentIndex) {
    return this.getRightChildIndex(parentIndex) > 0;
  }

  leftChild(parentIndex) {
    return this.heap[this.getLeftChildIndex(parentIndex)];
  }
  rightChild(parentIndex) {
    return this.heap[this.getRightChildIndex(parentIndex)];
  }
  parent(childIndex) {
    return this.heap[this.getParentIndex(childIndex)];
  }

  swap(a, b) {
    let tmp = a;
    this.heap[a] = b;
    this.heap[b] = tmp;
  }

  peek() {
    if (this.heap.length === 0) throw new Error("Heap is empty");
    return this.heap[0];
  }

  poll() {
    if (this.heap.length === 0) throw new Error("Heap is empty");
    if (this.heap.length === 1) return this.heap.pop();

    let item = this.heap[0];
    // Move the last element from the end to the head.
    this.heap[0] = this.heap.pop();
    this.heapifyDown();
    return item;
  }

  add(item) {
    this.heap.push(item);
    this.heapifyUp();
    return this;
  }

  heapifyUp() {
    // Take the last element (last in array or the bottom left in a tree)
    // in the heap container and lift it up until it is in the correct
    // order with respect to its parent element.
    let currentIdx = this.getParentIndex(this.heap.length - 1);
    while (
      this.hasParent(currentIdx) &&
      !this.pairIsInCorrectOrder(this.parent(currentIdx), this.heap[currentIdx])
    ) {
      this.swap(currentIdx, this.getParentIndex(currentIdx));
      currentIdx = this.getParentIndex(currentIdx);
    }
  }

  heapifyDown() {
    let index = 0;

    while (this.getLeftChildIndex(index)) {
      let nextIndex = this.getLeftChildIndex(index);
      if (
        this.hasRightChild(index) &&
        this.pairIsInCorrectOrder(this.rightChild(index), this.leftChild(index))
      ) {
        nextIndex = this.getRightChildIndex(index);
      }

      if (this.pairIsInCorrectOrder(this.heap[index], this.heap[nextIndex])) {
        break;
      } else {
        this.swap(index, nextIndex);
      }
      index = nextIndex;
    }
    return this;
  }

  toString(){
    return this.heap.toString();
  }

  /**
   * Checks if pair of heap elements is in correct order.
   * For MinHeap the first element must be always smaller or equal.
   * For MaxHeap the first element must be always bigger or equal.
   *
   * @param {*} firstElement
   * @param {*} secondElement
   * @return {boolean}
   */
  /* istanbul ignore next */
  pairIsInCorrectOrder(firstElement, secondElement) {
    throw new Error(`
      You have to implement heap pair comparision method
      for ${firstElement} and ${secondElement} values.
    `);
  }
}
