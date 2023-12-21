package Practice_11;

import java.util.Scanner;
import java.util.Date;
import java.util.Calendar;
public class Exercise_3 {
    public static void main(String[] args) {
        Scanner inFromUser = new Scanner(System.in);
        System.out.println("Student");
        System.out.print("Name: ");
        String name = inFromUser.nextLine();
        System.out.print("Surname: ");
        String surname = inFromUser.nextLine();
        System.out.print("Faculty: ");
        String faculty = inFromUser.nextLine();
        System.out.print("Course: ");
        int course = inFromUser.nextInt();
        System.out.print("Group: ");
        int group = inFromUser.nextInt();
        System.out.print("GPA: ");
        double GPA = inFromUser.nextDouble();
        System.out.print("Date of birth(dd.MM.yy): ");
        String dateOfBirth = inFromUser.next();

        Student student = new Student(name, surname, faculty, course, group, GPA, dateOfBirth);
        System.out.println(student.toString());
    }
}
