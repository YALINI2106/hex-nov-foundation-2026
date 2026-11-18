
package lms;

import java.util.Comparator;

public class CourseUtility implements Comparator<Course> {

    String direction;
    String sortBy;

    public CourseUtility(String direction) {
        this.direction = direction;
        this.sortBy = "FEES";
    }

    // New constructor for selecting sorting criteria
    public CourseUtility(String direction, String sortBy) {
        this.direction = direction;
        this.sortBy = sortBy;
    }

    @Override
    public int compare(Course c1, Course c2) {

        if(sortBy.equals("NAME")) {
            if(direction.equals("ASC")) {
                return c1.name.compareToIgnoreCase(c2.name);
            }
            else {
                return c2.name.compareToIgnoreCase(c1.name);
            }
        }

        if(direction.equals("ASC")) {
            if(c1.fees > c2.fees)
                return 1;

            if(c1.fees < c2.fees)
                return -1;
        }
        else {
            if(c1.fees < c2.fees)
                return 1;

            if(c1.fees > c2.fees)
                return -1;
        }

        return 0;
    }
}
