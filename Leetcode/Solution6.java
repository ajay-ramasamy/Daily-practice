//! 235. Lowest Common Ancestor of a Binary Search Tree
package Leetcode;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class Solution6 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode x, TreeNode y) {
        if(root==null)return null;
        if(root.val>x.val && root.val>y.val){
            return lowestCommonAncestor(root.left,x,y);
        }
        if(root.val<x.val && root.val<y.val){
            return lowestCommonAncestor(root.right,x,y);
        }
        return root;
    }
    
    public static void main(String[] args) {
        Solution6 sol = new Solution6();
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        TreeNode result = sol.lowestCommonAncestor(root, root.left, root.left.right);
        System.out.println(result.val);
    }
}
