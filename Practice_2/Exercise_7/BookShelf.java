package Practice_2.Exercise_7;

import java.util.Scanner;
public class BookShelf {
    private int size = 0;
    Book[] books = new Book[size];
    public BookShelf(int size) {
        Scanner inFromUser = new Scanner(System.in);
        this.size = size;
        int year;
        String name;
        String author;
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the name of the book: ");
            name = inFromUser.next();
            System.out.print("Enter the name of the author: ");
            author = inFromUser.next();
            System.out.print("Enter the year of the edition: ");
            year = inFromUser.nextInt();
            books = addBook(i, books, new Book(year, name, author));
        }
    };
    public static Book[] addBook(int size, Book[] books, Book newBook) {
        Book[] newBooks = new Book[size + 1];
        if (size != 0) {
            for (int i = 0; i < size; i++) {
                newBooks[i] = books[i];
            }
        }
        newBooks[size] = newBook;
        return newBooks;
    }
    public Book[] latestEdition() {
        int n = 0;
        Book[] arr = new Book[n];
        if (size <= 0) {
            return arr;
        }
        int latest = books[0].year;
        for (int i = 0; i < size; i++) {
            if (latest < books[i].year) {
                latest = books[i].year;
            }
        }
        for (int i = 0; i < size; i++) {
            if (latest == books[i].year) {
                arr = addBook(n, arr, books[i]);
                n+=1;
            }
        }
        return arr;
    }
    public Book[] earliestEdition() {
        int n = 0;
        Book[] arr = new Book[n];
        if (size <= 0) {
            return arr;
        }
        int earliest = books[0].year;
        for (int i = 0; i < size; i++) {
            if (earliest > books[i].year) {
                earliest = books[i].year;
            }
        }
        for (int i = 0; i < size; i++) {
            if (earliest == books[i].year) {
                arr = addBook(n, arr, books[i]);
                n+=1;
            }
        }
        return arr;
    }

}
