package Practice_3.Exercises_for_format_strings;

public class Employee {
    private String fullname;
    private double salary;

    public double getSalary() {
        return salary;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public Employee (String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }
}
