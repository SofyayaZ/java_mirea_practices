package Practice_9.Exercise_2;

import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 3.7));
        students.add(new Student("Alice", 4.0));
        students.add(new Student("Bob", 3.5));
        SortStudentsByGPA sorter = new SortStudentsByGPA();
        sorter.sortByGPA(students);

        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", GPA: " + student.getGPA());
        }
    }
}