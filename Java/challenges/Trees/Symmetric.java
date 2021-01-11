package challenges.Trees;
import java.util.*;

public class Symmetric {
    static void invert(TreeNode root){
        if(root == null) return;
        invert(root.left);
        invert(root.right);
        
        //swap child nodes
        TreeNode temp= root.right;
        root.right= root.left;
        root.left= temp;
    }
   public static boolean isSymmetric(TreeNode root){
        List<Integer> leftSubtree= new ArrayList<>();
        List<Integer> rightSubtree= new ArrayList<>();

        //invert the left subtree in order to check for symmetry
        invert(root.left);

        leftSubtree= Traversal.levelOrder(root.left);
        rightSubtree= Traversal.levelOrder(root.right);
        
        if(leftSubtree.size() != rightSubtree.size())
            return false;

        //check inverted left subtree with right subtree
        for(int i=0; i< leftSubtree.size(); i++){
            if(leftSubtree.get(i) != rightSubtree.get(i))
                return false;
        }
        //if same, is symmetric
        return true;
    }
}
