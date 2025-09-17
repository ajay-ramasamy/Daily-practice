//! 543. Diameter of Binary Tree

import javax.swing.tree.TreeNode;

public class Solution8 {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        int h1 = height(root.left);
        int h2 = height(root.right);
        int d1 = diameterOfBinaryTree(root.left);
        int d2 = diameterOfBinaryTree(root.right);
        return Math.max(Math.max(d1,d2),h1+h2);

    }
    private static int height(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+Math.max(height(root.left),height(root.right));
    }
}
