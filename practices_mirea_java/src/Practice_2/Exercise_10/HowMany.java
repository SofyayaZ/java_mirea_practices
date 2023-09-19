package Practice_2.Exercise_10;

import java.util.Scanner;
public class HowMany {
    public static void main(String[] args) {
        Scanner inFromUser = new Scanner(System.in);
        System.out.println("Enter your text: ");
        String text = inFromUser.nextLine();
        String[] words = text.split("[\\p{Punct}\\s]+");
        int count = words.length;
        System.out.println("There are " + count + " words in your text");
    }
}
