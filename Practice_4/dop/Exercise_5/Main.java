package Practice_4.dop.Exercise_5;

import Practice_4.dop.Exercise_5.Book;
import Practice_4.dop.Exercise_5.Reader;

public class Main {
    public static void main(String[] args) {
        Practice_4.dop.Exercise_5.Reader reader = new Practice_4.dop.Exercise_5.Reader("Петров В. В.", 123456, "Факультет", "01.01.1990", "1234567890");
        reader.takeBook(3); // Петров В. В. взял 3 книги

        reader.takeBook("Приключения", "Словарь", "Энциклопедия"); // Петров В. В. взял книги: Приключения, Словарь, Энциклопедия

        Practice_4.dop.Exercise_5.Book book1 = new Practice_4.dop.Exercise_5.Book("Приключения", "Автор1");
        Practice_4.dop.Exercise_5.Book book2 = new Practice_4.dop.Exercise_5.Book("Словарь", "Автор2");
        Practice_4.dop.Exercise_5.Book book3 = new Practice_4.dop.Exercise_5.Book("Энциклопедия", "Автор3");
        reader.takeBook(book1, book2, book3); // Петров В. В. взял книги: Приключения (Автор1), Словарь (Автор2), Энциклопедия (Автор3)

        reader.returnBook(3); // Петров В. В. вернул 3 книги

        reader.returnBook("Приключения", "Словарь", "Энциклопедия"); // Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия

        reader.returnBook(book1, book2, book3); // Петров В. В. вернул книги: Приключения (Автор1), Словарь (Автор2), Энциклопедия (Автор3)
    }
}