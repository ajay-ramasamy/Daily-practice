//! Remove cycle/loop in a linkedlist
package GFG;
import java.util.HashSet;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

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
    
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head.next; // Create cycle
        removeLoop(head);
        System.out.println("Loop removed");
    }
}
