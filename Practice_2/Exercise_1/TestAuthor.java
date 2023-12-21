package Practice_2.Exercise_1;

import java.util.Scanner;
public class TestAuthor {
    public static void main(String[] args) {
        Author a = new Author("Sarah", "sarahv@mail.com", 'f');
        Scanner inFromUser = new Scanner(System.in);
        System.out.println(a.toString());
        System.out.print("Enter a new email: ");
        a.setEmail(inFromUser.nextLine());
        System.out.println(a.getEmail());
        System.out.println(a.toString());

    }
}
