import java.util.Scanner;

public class AttendanceReport {
    public static void main(String[] args) {

        // 1.DP for finding total attendance in a range
        int[] attendance = { 17,13,7,5,12,18,14,15,20,11} ;

        int[] att_report = new int[10];

        att_report[0] = 0;

        for(int i = 1 ; i < 10 ; i++){
            att_report[i] = att_report[i-1] + attendance[i];
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Start date : ");
        int start = sc.nextInt();
        System.out.println("Enter End date : ");
        int end = sc.nextInt();
        if (start >= 1 && end <= 10 && start <= end) {

            int total;

            if (start == 1) {
                total = att_report[end - 1];
            } else {
                total = att_report[end - 1] - att_report[start - 2];
            }

            System.out.println("Attendance from day "
                    + start + " to day " + end + ": " + total);

        } else {
            System.out.println("Invalid range");
        }


        // 2. Brute Force: Find highest attendance
        int max = attendance[0];
        int maxDay = 1;

        for (int i = 1; i < 10; i++) {

            if (attendance[i] > max) {
                max = attendance[i];
                maxDay = i + 1;
            }
        }

        System.out.println("Highest attendance: " + max);
        System.out.println("Highest attendance day: " + maxDay);

    }
}
