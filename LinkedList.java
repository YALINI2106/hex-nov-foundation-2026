import java.util.Queue;

public class LinkedList {
    public static void main(String[] args) {

        Queue<String> LL = new java.util.LinkedList<>();

        LL.offer("APPLE");
        LL.offer("BANANA");
        LL.offer("STRAWBERRY");

        System.out.println(LL);

        System.out.println("Removed: " + LL.poll());

        System.out.println("Front: " + LL.peek());

        System.out.println("Size: " + LL.size());

        System.out.println(LL);
    }
}
