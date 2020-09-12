/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root1
 * @param {TreeNode} root2
 * @return {boolean}
 */
// create helper functions
function leafSum(root, sum){ 
    if (!root) 
        return; 
  
    // add root data to sum if  
    // root is a leaf node 
    if (!root.left && !root.right) 
        sum += root.val; 
  
    // propagate recursively in left 
    // and right subtree 
    leafSum(root.left, sum); 
    leafSum(root.right, sum); 
    }
var leafSimilar = function(root1, root2) {
    
};