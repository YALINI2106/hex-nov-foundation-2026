
import java.util.Stack;
import java.util.Scanner;

public class LIFODemo {
    public static void main(String[] args) {

        Stack<String> learners = new Stack<>();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n--- Enrollment Menu ---");
            System.out.println("1. Enroll learner");
            System.out.println("2. Undo last enrollment");
            System.out.println("3. Show last enrollment");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter learner name: ");
                    String name = sc.nextLine();
                    learners.push(name);
                    System.out.println(name + " enrolled successfully.");
                    break;

                case 2:
                    try {
                        System.out.println("Undone: " + learners.pop());
                    } catch (Exception e) {
                        System.out.println("Nothing to undo.");
                    }
                    break;

                case 3:
                    try {
                        System.out.println("Last enrollment: " + learners.peek());
                    } catch (Exception e) {
                        System.out.println("Nothing to undo.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid menu choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}
