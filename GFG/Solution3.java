//! level order traversal of binary tree

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution3 {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        
        if(root==null){
            return null;
        }
        
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        res.add(root.data);
        ans.add(res);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node p = q.poll();
            res = new ArrayList<>();
            if(p.left!=null){
                q.add(p.left);
                res.add(p.left.data);
            }
            if(p.right!=null){
                q.add(p.right);
                res.add(p.right.data);
            }
            ans.add(res);
        }
        return ans;
        
    }
}
