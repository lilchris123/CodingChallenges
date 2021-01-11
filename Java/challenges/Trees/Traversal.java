package challenges.Trees;

import java.util.*;

public class Traversal {
    public static void preorder(TreeNode root){
        //visit node
        System.out.println(root.val);
        
        //recursively go to left subtree
        if(root.left != null)
            preorder(root.left);

        //recursively go to right subtree
        if(root.right != null)
            preorder(root.right);
    }
    public static void inorder(TreeNode root){
        
        //recursively go to left subtree
        if(root.left != null)
            preorder(root.left);

        //visit node
        System.out.println(root.val);
            
        //recursively go to right subtree
        if(root.right != null)
            preorder(root.right);
    }

    public static void postorder(TreeNode root){
        
        //recursively go to left subtree
        if(root.left != null)
            preorder(root.left);
            
        //recursively go to right subtree
        if(root.right != null)
            preorder(root.right);

        //visit node
        System.out.println(root.val);
    }

    public static void preorderIterative(TreeNode root){
       Stack<TreeNode> stack= new Stack<>();
       stack.push(root);

       while(!stack.isEmpty()){
           TreeNode currNode= stack.pop();
           //visit node
           System.out.print(currNode.val+ " ");

           if(currNode.right != null)
            stack.push(currNode.right);
           
            if(currNode.left != null)
            stack.push(currNode.left);
       }
    }

    public static void inorderIterative(TreeNode root){
        Stack<TreeNode> s= new Stack<>();
        TreeNode currNode= root;

        while(!s.isEmpty()){
            while(currNode != null){
                s.push(currNode);
                currNode = currNode.left;
            }
            
            currNode= s.pop();
            //visit node
            System.out.print(currNode.val+ " ");
 
            currNode= currNode.right;
        }
     }

     public static void postorderIterative(TreeNode root){
         Stack<TreeNode> s1= new Stack<>();
         Stack<TreeNode> s2= new Stack<>();

        // push root to first stack 
        s1.push(root); 
  
        // Run while first stack is not empty 
        while (!s1.isEmpty()) { 
            // Pop an item from s1 and push it to s2 
            TreeNode temp = s1.pop(); 
            s2.push(temp); 
  
            // Push left and right children of 
            // removed item to s1 
            if (temp.left != null) 
                s1.push(temp.left); 
            if (temp.right != null) 
                s1.push(temp.right); 
        } 
  
        // Print all elements of second stack 
        while (!s2.isEmpty()) { 
            TreeNode temp = s2.pop(); 
            System.out.print(temp.val + " "); 
        } 
     }

     //Implementation of BFS
    public static List<Integer> levelOrder(TreeNode root) {
        List<Integer> result =new ArrayList<>();
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
            
        while(!q.isEmpty()){
            TreeNode node= q.poll();
            result.add(node.val);

            if(node.left != null)
                q.add(node.left);
            if(node.right != null)
                q.add(node.right);

        }
        return result;
    }
    
}
