package feb.ex_10032025_CollectionFramework_Part_3;

import java.util.PriorityQueue;

public class Lab110_Queue {
    public static void main(String[] args) {
        // Queue - < 0.01% in Automation
        PriorityQueue pq = new PriorityQueue();
        pq.offer("1"); // add
        pq.offer("3");
        pq.offer("2");
        pq.offer("4");
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);


    }
}
