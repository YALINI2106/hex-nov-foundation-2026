package lms;

public class Course {
    int id;
    String name ;
    int fees;

    public Course(int id, String name, int fees) {
        this.id = id;
        this.name = name;
        this.fees = fees;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fees=" + fees +
                '}';
    }
}
