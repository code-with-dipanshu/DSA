package LINKED_LIST;

import LINKED_LIST.ll.Node;

public class cycle {

    static boolean hasCycle(Node head) {

        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }

        }

        return false;
    }

    static int lengthofCycle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                Node temp = slow.next;
                int length = 1;
                while (temp != slow) {
                    length++;
                    temp = temp.next;
                }
                return length;

            }

        }

        return 0;

    }

    // position of cycle\

    static Node Position(Node head) {

        Node slow = head;
        Node fast = head;

        while ( fast != null && fast.next != null ) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                slow = head;
                while (fast != slow) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(6);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = head.next.next;

        System.out.println(hasCycle(head));

        System.out.println(lengthofCycle(head));

        System.out.println(Position(head).val);
    }
}
