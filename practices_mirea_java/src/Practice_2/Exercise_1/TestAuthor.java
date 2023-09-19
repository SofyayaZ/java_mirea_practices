package Practice_2.Exercise_1;

import Practice_2.Exercise_1.Author;
import java.lang.*;
import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        Author a = new Author("Sarah", "sarahv@mail.com", 'f');
        Scanner inFromUser = new Scanner(System.in);
        System.out.println(a.getName());
        System.out.println(a.getEmail());
        System.out.println(a.getGender());
        System.out.println("Enter a new email: ");
        a.setEmail(inFromUser.nextLine());
        System.out.println(a.getEmail());
        System.out.println(a.toString());

    }
}
