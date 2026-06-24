package LINKED_LIST;

public class ll {

    static public class Node {

        public int val;
        public Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

    }

    public static void display(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("END");
    }

    // Remove Duplicates forom sorted linked list

    public static Node RemoveDuplicate(Node head) {
        Node temp = head;

        while (temp != null && temp.next != null) {
            if (temp.val == temp.next.val) {
                temp.next = temp.next.next;

            } else {
                temp = temp.next;
            }
        }
        return head;
    }

    // Merge two sorted Linked list in sorted way

    public static Node Merge(Node list1, Node list2) {
        Node temp = new Node(0);
        Node dummy = temp;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                dummy.next = list1;
                list1 = list1.next;

            } else {
                dummy.next = list2;
                list2 = list2.next;
            }
            dummy = dummy.next;
        }

        if (list1==null){
            dummy.next = list2;

        }
        if (list2== null){
            dummy.next =list1;
        }
        return temp.next;

    }

    public static void main(String[] args) {
        // remove duplicate 
        // Node head = new Node(10);
        // head.next = new Node(10);
        // head.next.next = new Node(20);
        // head.next.next.next = new Node(20);
        // head.next.next.next.next = new Node(30);

        // display(head);

        // head = RemoveDuplicate(head);

        // display(head);


        // merge two sorted list
        Node list1 = new Node(1);
        list1.next = new Node(3);
        list1.next.next = new Node(5);

        Node list2 = new Node(2);
        list2.next = new Node(4);
        list2.next.next = new Node(6);
        list2.next.next.next = new Node(14);
        list2.next.next.next.next = new Node(16);
        

        
        display(list1);
        display(list2);
        
        Node ans = Merge(list1, list2);
        display(ans);

    }
}
