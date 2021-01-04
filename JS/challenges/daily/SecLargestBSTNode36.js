
/*
This problem was asked by Dropbox.

Given the root to a binary search tree, find the second largest node in the tree.

algo
if root empty 
    return null

if left subtree and right subtree empty
    return null

if right subtree is empty
    return the right most node of the left child of root

else in right subtree move down to right most node, storing previous parent
    if  node is is leaf node
        return previous parent node

    else if it has a left child 
        return child node
*/

export function secLargestNode(root){

    if(root == null)
        return null;

    if(!root.left && !root.right)
        return null;

    let curr= root;

    if(!root.right){
        curr=curr.left;
        while(curr.right){
            curr=curr.right;
        }
        return curr.value;
    }

    let prev = null;
    while(curr.right){
        prev=curr;
        curr=curr.right;
    }

    if(curr.left)
        return curr.left.value;
    else
        return prev.value;

}