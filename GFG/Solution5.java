//! detect cycle in a linked list

import java.util.HashSet;

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
}
