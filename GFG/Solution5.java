//! detect cycle in a linked list

import java.util.HashSet;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Solution5 {
    public boolean detectLoop(Node head) {
        
        Node slow = head;
        HashSet<Node> s = new HashSet<>();
        while(slow!=null){
            if(s.contains(slow)){
                return true;
            }
            s.add(slow);
            slow = slow.next;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Solution5 sol = new Solution5();
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head.next; // Create cycle
        System.out.println(sol.detectLoop(head));
    }
}
