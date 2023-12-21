package Practice_11;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class Exercise_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter year:");
        int year = scanner.nextInt();

        System.out.println("Enter month (1-12):");
        int month = scanner.nextInt() - 1;

        System.out.println("Enter day:");
        int day = scanner.nextInt();

        System.out.println("Enter hours:");
        int hours = scanner.nextInt();

        System.out.println("Enter minutes:");
        int minutes = scanner.nextInt();

        Date date = new Date(year - 1900, month, day, hours, minutes);
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day, hours, minutes);

        System.out.println("Date: " + date);
        System.out.println("Calendar: " + calendar.getTime());
    }
}
