package LINKED_LIST;

import LINKED_LIST.ll.Node;

public class reversell {
    
    public static Node reverse(Node head){

        Node prev = null;
        Node curr = head;
        Node n = head.next;
        while(curr != null){
            curr.next = prev;

            curr = prev;
            prev = n;
            if(n != null){
            n = n.next;}




         }
         return prev;

        
    }

    public static void main(String[] args) {
        

    }
}
