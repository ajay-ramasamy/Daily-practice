//! Remove cycle/loop in a linkedlist
import java.util.HashSet;

public class Solution6 {
    public static void removeLoop(Node head) {
        
        Node prev = head;
        Node temp = head;
        HashSet<Node> s = new HashSet<>();
        while(temp!=null){
            if(s.contains(temp)){
                prev.next = null;
                break;
            }
            s.add(temp);
            prev = temp;
            temp = temp.next;
            
        }
        
    }
}
