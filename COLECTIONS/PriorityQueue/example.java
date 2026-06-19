package COLECTIONS.PriorityQueue;
import java.util.*;

public class example {
    
    public static void main(String[] args) {
        Queue<Integer>  minQ = new PriorityQueue<>();//min HEap

        minQ.add(20);
        minQ.add(10);
        minQ.add(5);
        System.out.println(minQ);


        // MAX HEAP
        Queue<Integer> maxQ= new PriorityQueue<>(Collections.reverseOrder());

        maxQ.offer(40);
        maxQ.offer(60);
        maxQ.offer(80);
        System.out.println(maxQ);



    }
}
