package Practice_3.Exercises_for_format_strings;

public class Report {
    public static void generateReport(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.printf("%-10s earns %-16.2f\n", employee.getFullname(), employee.getSalary());
        }
    }
}
