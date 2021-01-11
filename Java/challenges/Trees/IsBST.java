package challenges.Trees;

public class IsBST {
    static int maxValue(TreeNode root){
        if(root == null) return 0;
        if(root.right == null) 
            return root.val;
        return maxValue(root.right);
    }
    static int minValue(TreeNode root){
        if(root == null) return 0;
        if(root.left == null) 
            return root.val;
        return minValue(root.left);
    }
    public static boolean isBST(TreeNode root){
        if(root == null) return true;

        if(root.left != null && maxValue(root.left) > root.val)
            return false;
        if(root.right != null && minValue(root.right) < root.val)
            return false;
        
        if(!isBST(root.left) || !isBST(root.right))
            return false;

        return true;
    }
}
