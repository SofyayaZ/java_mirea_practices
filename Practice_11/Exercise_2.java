package Practice_11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Exercise_2 {
    public static void main(String[] args) {
        Date currentDate = new Date();
        Scanner inFromUser = new Scanner(System.in);
        System.out.println("Enter your date and time in format: \"dd.MM.yyyy HH:mm:ss\": ");
        String input = inFromUser.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        Date userDate = null;
        try {
            userDate = dateFormat.parse(input);
        } catch (ParseException e) {
            System.out.println("Incorrect input!");
            return;
        }

        if(userDate.before(currentDate)) {
            System.out.println("User's date and time is earlier than current ones.");
        }
        else if(userDate.after(currentDate)) {
            System.out.println("User's date and time is later than current ones.");
        }
        else {
            System.out.println("User's date and time equals to current ones.");
        }
    }
}
