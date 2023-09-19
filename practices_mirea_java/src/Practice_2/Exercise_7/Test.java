package Practice_2.Exercise_7;

import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner inFromUser = new Scanner(System.in);
        System.out.println("Enter the number of the books on the shelf: ");
        int size = inFromUser.nextInt();
        BookShelf shelf = new BookShelf(size);
        Book[] latestEditionBooks = shelf.latestEdition();
        for (int i = 0; i < latestEditionBooks.length; i ++) {
            System.out.println(latestEditionBooks[i].toString());
        }
        Book[] earliestEditionBooks = shelf.earliestEdition();
        for (int i = 0; i < earliestEditionBooks.length; i++) {
            System.out.println((earliestEditionBooks[i].toString()));
        }
    }
}
