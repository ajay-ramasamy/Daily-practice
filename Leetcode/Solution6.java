//! 235. Lowest Common Ancestor of a Binary Search Tree
package Leetcode;
package Leetcode;
import javax.swing.tree.TreeNode;

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
}
