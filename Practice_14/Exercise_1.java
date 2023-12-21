package Practice_14;

import java.util.Scanner;
public class Exercise_1 {
    public static void main(String[] args) {
        Scanner inFromUser = new Scanner(System.in);

        System.out.println("Enter your string: ");
        String inputString = inFromUser.nextLine();

        System.out.println("Enter regular expression for split: ");
        String regex = inFromUser.nextLine();

        String[]elements = inputString.split(regex);

        System.out.println("Results: ");
        for (String element: elements) {
            System.out.println(element);
        }

        inFromUser.close();
    }
}
