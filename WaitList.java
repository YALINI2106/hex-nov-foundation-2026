
import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;

public class WaitList {
    public static void main(String[] args) {

        String[] seats = new String[3];
        Queue<String> waitlist = new LinkedList<>();

        String[] learners = {"Asha", "Ravi", "Meena", "Kiran", "Pooja"};

        // Learners joining one by one
        for (String name : learners) {

            boolean assigned = false;

            for (int i = 0; i < seats.length; i++) {
                if (seats[i] == null) {
                    seats[i] = name;
                    assigned = true;
                    break;
                }
            }

            if (assigned) {
                System.out.println(name + " got a seat.");
            } else {
                waitlist.offer(name);
                System.out.println(name + " added to waitlist.");
            }

            System.out.println("Seats: " + Arrays.toString(seats));
            System.out.println("Waiting: " + waitlist);
            System.out.println();
        }

        // Ravi drops out
        String dropName = "Ravi";
        boolean found = false;

        for (int i = 0; i < seats.length; i++) {

            if (seats[i] != null && seats[i].equals(dropName)) {

                found = true;
                seats[i] = null;

                System.out.println(dropName + " dropped out.");

                // Give the seat to the first learner in waitlist
                String nextLearner = waitlist.poll();

                if (nextLearner != null) {
                    seats[i] = nextLearner;
                    System.out.println(nextLearner + " got the vacant seat.");
                } else {
                    System.out.println("Waitlist is empty. Seat is vacant.");
                }

                break;
            }
        }

        if (!found) {
            System.out.println(dropName + " is not in the batch.");
        }

        System.out.println("\nFinal Seats: " + Arrays.toString(seats));
        System.out.println("Final Waiting List: " + waitlist);
    }
}
