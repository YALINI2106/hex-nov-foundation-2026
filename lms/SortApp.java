
package lms;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class SortApp {
    public static void main(String[] args) {

        Course c1 = new Course(101, "JAVA", 15000);
        Course c2 = new Course(102, "Python", 12000);
        Course c3 = new Course(103, "React", 15000);
        Course c4 = new Course(104, "SQL", 8000);
        Course c5 = new Course(105, "Angular", 12000);

        List<Course> list = new ArrayList<>();

        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        list.add(c5);

        System.out.println("Total Number of Courses: " + list.size());

        System.out.println("Show available courses:");

        for(Course c : list) {
            System.out.println(c);
        }

        // Existing fee sorting
        System.out.println("Courses in ascending order by fee (low to high):");
        sortCourses(list, "ASC");

        System.out.println("Courses in descending order by fee (high to low):");
        sortCourses(list, "DESC");

        // New alphabetical sorting
        System.out.println("Courses in alphabetical order (A-Z):");
        sortCoursesByName(list, "ASC");

        System.out.println("Courses in reverse alphabetical order (Z-A):");
        sortCoursesByName(list, "DESC");
    }

    // Existing method - fee sorting
    private static void sortCourses(List<Course> list, String direction) {
        Collections.sort(list, new CourseUtility(direction));

        for(Course c : list) {
            System.out.println(c);
        }
    }

    // New method - alphabetical sorting
    private static void sortCoursesByName(List<Course> list, String direction) {
        Collections.sort(list, new CourseUtility(direction, "NAME"));

        for(Course c : list) {
            System.out.println(c);
        }
    }
}
