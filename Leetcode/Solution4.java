//! Maximum Depth of the binary tree;
package Leetcode;

public class Solution4 {
    class TreeMap {
        int data;
        TreeMap left;
        TreeMap right;
        TreeMap(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public int maxDepth(TreeMap root) {
        if(root==null){
            return 0;
        }
        return Math.max(1+maxDepth(root.left),1+maxDepth(root.right));
    }
    
    public static void main(String[] args) {
        Solution4 sol = new Solution4();
        Solution4.TreeMap root = sol.new TreeMap(3);
        root.left = sol.new TreeMap(9);
        root.right = sol.new TreeMap(20);
        root.right.left = sol.new TreeMap(15);
        root.right.right = sol.new TreeMap(7);
        System.out.println(sol.maxDepth(root));
    }
}
