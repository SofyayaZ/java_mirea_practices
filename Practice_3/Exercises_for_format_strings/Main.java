package Practice_3.Exercises_for_format_strings;

import java.util.Random;
import static Practice_3.Exercises_for_format_strings.Report.generateReport;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        Random rand = new Random();
        String[] names = new String[] {"Jack", "Emely", "Tom", "Clancy", "Anna"};
        for (int i = 0; i < 5; i++) {
            employees[i] = new Employee(names[rand.nextInt(5)], rand.nextDouble(400.45, 1000));
        }

        generateReport(employees);
    }
}
