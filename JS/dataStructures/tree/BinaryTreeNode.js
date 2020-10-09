export default class BinaryTreeNode {
  constructor(value = null) {
    this.left = null;
    this.right = null;
    this.value = value;
    this.parent = null;
  }

  /**
   * @return {number}
   */
  get leftHeight() {
    if (!this.left) return 0;

    return 1 + this.left.height();
  }

  /**
   * @return {number}
   */
  get rightHeight() {
    if (!this.right) return 0;

    return 1 + this.left.height();
  }

  /**
   * @return {number}
   */
  get height() {
    return Math.max(this.leftHeight(), this.rightHeight());
  }

  /**
   * @return {number}
   */
  get balanceFactor() {
    return this.leftHeight() - this.rightHeight();
  }

  /**
   * Get parent's sibling if it exists.
   * @return {BinaryTreeNode}
   */
  get uncle() {
    if (!this.parent) return undefined;
    //check if this node has a grandparent
    if (!this.parent.parent) return undefined;

    //check if the grandparent has to children
    if (!this.parent.parent.left || !this.parent.parent.right) return undefined;

    //find and return the uncle
    return this.parent.parent.left === this.parent
      ? this.parent.parent.right
      : this.parent.parent.left;
  }

  /**
   * @param {*} value
   * @return {BinaryTreeNode}
   */
  setValue(value) {
    this.value = value;

    return this;
  }
  /**
   * @param {BinaryTreeNode} node
   * @return {BinaryTreeNode}
   */
  setLeft(node) {
    if (this.left) {
      this.left.parent = null;
    }
    this.left = node;
    if (this.left) this.left.parent = this;
    return this;
  }

  /**
   * @param {BinaryTreeNode} node
   * @return {BinaryTreeNode}
   */
  setRight(node) {
    if (this.right) {
      this.right.parent = null;
    }
    this.right = node;
    if (this.right) this.right.parent = this;
    return this;
  }

  /**
   * @param {BinaryTreeNode} nodeToRemove
   * @return {boolean}
   * removes whole subtree
   */
  removeChild(nodeToRemove) {
    if (this.left && this.left === nodeToRemove) {
      this.left = null;
      return true;
    }
    if (this.right && this.right === nodeToRemove) {
      this.right = null;
      return true;
    }
    return false;
  }

  /**
   * @param {BinaryTreeNode} nodeToReplace
   * @param {BinaryTreeNode} replacementNode
   * @return {boolean}
   */
  replaceChild(nodeToReplace, replacementNode) {
    if (!nodeToReplace || !replacementNode) return false;
    if (this.left && this.left === nodeToReplace) {
      this.left === replacementNode;
      return true;
    }
    if (this.right && this.right === nodeToReplace) {
      this.right === replacementNode;
      return true;
    }
    return false;
  }

  /**
   * @param {BinaryTreeNode} sourceNode
   * @param {BinaryTreeNode} targetNode
   */
  static copyNode(sourceNode, targetNode) {
    targetNode.setValue(sourceNode.value);
    targetNode.setLeft(sourceNode.left);
    targetNode.setRight(sourceNode.right);
  }
  /**
   * @return {*[]}
   */
  traverseInOrder() {
    let traverse = [];

    if (this.left) traverse = [...traverse, this.left.traverseInOrder()];
    traverse.push(this.value);
    if (this.right) traverse = [...traverse, this.right.traverseInOrder()];

    return traverse;
  }

  traverseInOrderPrint() {
    if (this) {
      this.traverseInOrderPrint(this.left);
      console.log(this.value + " ");
      this.traverseInOrderPrint(this.right);
    }
  }

  static traverseInOrderPrint(root) {
    if (root) {
      root.traverseInOrderPrint(root.left);
      console.log(root.value + " ");
      root.traverseInOrderPrint(root.right);
    }
  }
  toString() {
    return this.traverseInOrder().toString();
  }
}
