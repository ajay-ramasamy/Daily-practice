//! level order traversal of binary tree
package GFG;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

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
    
    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println(sol.levelOrder(root));
    }
}
