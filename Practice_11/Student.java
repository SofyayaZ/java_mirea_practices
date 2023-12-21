package Practice_11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Student {
    String name;
    String surname;
    String faculty;
    int course;
    int group;
    double GPA;
    LocalDate dateOfBirth;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getGroup() {
        return group;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public double getGPA() {
        return GPA;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yy");
        this.dateOfBirth = LocalDate.parse(dateOfBirth, formatter);
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String formatDateOfBirth(String format) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        return dateOfBirth.format(formatter);
    }

    public Student(String name, String surname, String faculty, int course, int group, double GPA, String dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
        this.GPA = GPA;
        setDateOfBirth(dateOfBirth);
    }

    @Override
    public String toString() {
        return "Student {" +
                "name = " +  name +
                ", surname = " +  surname +
                ", faculty = " +  faculty +
                ", course = " +  course +
                ", group = " +  group +
                ", GPA = " +  GPA +
                ", dateOfBirth = " + dateOfBirth.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) + '}';
    }
}

