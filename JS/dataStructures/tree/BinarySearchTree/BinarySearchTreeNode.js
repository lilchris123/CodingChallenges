import BinaryTreeNode from "../BinaryTreeNode";

export default class BinarySearchTreeNode extends BinaryTreeNode {
  constructor(value = null) {
    super(value);
  }
  /**
   * @param {*} value
   * @return {BinarySearchTreeNode}
   */
  insert(value) {
    if (!this) {
      this.value = value;
      return this;
    }
    const newNode = BinarySearchTreeNode(value);
    // if node value is less than current node than go the left of its subtree
    if (newNode.value < this.value) {
      //insert to the left
      if (this.left) this.left.insert(this.value);
      this.setLeft(newNode);
      return newNode;
    }

    // if node value is greather than current node than go the right of its subtree
    if (newNode.value > this.value) {
      //insert to the right
      if (this.right) this.left.insert(this.value);
      this.setRight(newNode);
      return newNode;
    }

    return this;
  }

  /**
   * @return {BinarySearchTreeNode}
   */
  remove(value) {
    //find the node and set the ref to this
    const nodeToRemove = this.find(value);

    //nodeToDelete = this;
    if (!nodeToRemove) throw new Error("Item not found in tree");

    const { parent } = nodeToRemove;

    //case 1: leaf node
    if (nodeToRemove.left === null && nodeToRemove.right === null) {
      //has a parent
      if(parent){
        parent.removeChild(nodeToRemove);
      }
      // no parent
      else
        nodeToRemove.setValue(undefined);
    }

    //case 2: one child
    else if (!nodeToRemove.left || !nodeToRemove.right) {
      const childNode = nodeToRemove.left || nodeToRemove.right;
      //has parent
      if(parent){
        parent.replaceChild(nodeToRemove,childNode);
      }
      //no parent its the root node, replace the node
      else{
        nodeToRemove.setValue(childNode.value);
        nodeToRemove.setLeft(childNode.left);
        nodeToRemove.setRight(childNode.right);
      }
    }
    //case 3: two children
    else{
      const nextBiggerNode = nodeToRemove.right.findMin();
      // Find the next biggest value (minimum value in the right branch)
      // and replace current value node with that next biggest value.
      if(nextBiggerNode !== nodeToRemove.right){
        this.remove(nodeToRemove.value);
        nodeToRemove.setValue(nextBiggerNode.value)
      }
      else{
        // In case if next right value is the next bigger one and it doesn't have left child
        // then just replace node that is going to be deleted with the right node.
        nodeToRemove.setValue(nextBiggerNode.right.value);
        nodeToRemove.setRight(nextBiggerNode.right);
      }
    }

    nodeToRemove.parent =null;
    return nodeToRemove;
  }

  /**
   * @param {*} value
   * @return {BinarySearchTreeNode}
   */
  find(value) {
    if (!this) return null;
    if (value === this.value) return this;
    else if (value < this.value) this.left.find(value);
    else if (value > this.value) this.right.find(value);
    return null;
  }
  /**
   * @param {*} value
   * @return {BinarySearchTreeNode}
   */
  findParent(value) {
    return this.find(value)?.parent;
  }

  /**
   * @param {*} value
   * @return {boolean}
   */
  contains(value) {
    return !!this.find(value);
  }

  /**
   * @return {BinarySearchTreeNode}
   */
  findMin() {
    if (!this.left) return this;
    return this.left.findMin();
  }

  /**
   * @param {BinarySearchTreeNode} root
   * @return {BinarySearchTreeNode}
   */
  static findMin(root) {
    if (!root.left) return root;
    return root.left.findMin();
  }

  /**
   * @return {BinarySearchTreeNode}
   */
  findMax() {
    if (!this.right) return this;
    return this.right.findMin();
  }

  /**
   * @param {BinarySearchTreeNode}
   * @return {BinarySearchTreeNode}
   */
  static findMax(root) {
    if (!root.right) return root;
    return root.right.findMin();
  }
  preOrderPrint() {
    if (this) {
      console.log(this.value + " ");
      this.preorder(this.left);
      this.preorder(this.right);
    }
  }
  static preOrderPrint(root) {
    if (root) {
      console.log(root.value + " ");
      this.preorder(root.left);
      this.preorder(root.right);
    }
  }
  postOrderPrint() {
    if (this) {
      this.preorder(this.left);
      this.preorder(this.right);
      console.log(this.value + " ");
    }
  }
  static postOrderPrint(root) {
    if (root) {
      this.preorder(root.left);
      this.preorder(root.right);
      console.log(root.value + " ");
    }
  }
}
