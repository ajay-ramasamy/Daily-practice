//! Maximum Depth of the binary tree;

import java.util.TreeMap;

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
}
