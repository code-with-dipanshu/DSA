package COLECTIONS.LIST;

import java.util.Stack;

public class stackkk {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(4);
        s.push(6);
        s.push(8);

        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.search(6));
        System.out.println(s.isEmpty());
        s.pop();
        System.out.println(s);

    }

}
