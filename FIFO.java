

import java.util.Queue;
import java.util.LinkedList;

public class FIFO {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();

        q.offer("Harry");
        q.offer("Frodo");
        q.offer("Pipin");


        System.out.println(q);

        System.out.println("Removed: " + q.poll());

        System.out.println("Queue: " + q);

        System.out.println("Front: " + q.peek());

        q.offer("Hermione");

        System.out.println("After insertion: " + q);




    }
}
