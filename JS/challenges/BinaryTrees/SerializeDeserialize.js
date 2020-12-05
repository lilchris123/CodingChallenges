/**
 Given the root to a binary tree, implement serialize(root), which serializes the tree into a string, and deserialize(s), which deserializes the string back into the tree.

For example, given the following Node class

class Node:
    def __init__(self, val, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
The following test should pass:

node = Node('root', Node('left', Node('left.left')), Node('right'))
assert deserialize(serialize(node)).left.left.val == 'left.left'

Create Node class
serialize(root)
    implement BST that returns an array of all nodes
    iterate the tree array, joining all the elements into a single string
    return string trimmed
deserialized(string)
    split the string into an array

 */
class Node {
  constructor(val, left = null, right = null) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}

function BST(root) {
    let queue = [root];
    let tree = [root.val];

  while (queue.length >0) {
      let node= queue[0];

      tree.push(node.left? node.left.val: null);
      tree.push(node.right? node.right.val: null);

    if (node.left) {
      queue.push(node.left);
    }
    if (node.right) {
      queue.push(node.right);
    }
    queue.shift();
  }
  return tree;
}

function serializeBT(root) {
    let tree= BST(root);
    let str='';
    for(let e of tree){
        str+= `${e} `;
    }
    return str.trim();
}
function deserializeBT(s) {
    let tree = s.split(' ');
    let newRoot= new Node(tree[0]);
    for(let i= 1; i< Math.log(tree.length); i++){
        newRoot.left= new Node(tree[2*i+1]);
        newRoot.right= new Node(tree[2*i+2]);
    }
    return newRoot;
}

let root= new Node(5,new Node(3), new Node(4,null,new Node(7)));
s = serializeBT(root);
console.log(s);
console.log(deserializeBT(s));