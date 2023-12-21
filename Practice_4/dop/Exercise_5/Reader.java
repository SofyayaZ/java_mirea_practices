package Practice_4.dop.Exercise_5;

import Practice_4.dop.Exercise_5.Book;

public class Reader {
    String fio;
    int ticketNumber;
    String faculty;
    String birthDate;
    String phoneNumber;

    public Reader(String fio, int ticketNumber, String faculty, String birthDate, String phoneNumber) {
        this.fio = fio;
        this.ticketNumber = ticketNumber;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int count) {
        System.out.println(fio + " взял " + count + " книги");
    }

    public void takeBook(String... titles) {
        StringBuilder message = new StringBuilder(fio + " взял книги: ");
        for (String title : titles) {
            message.append(title).append(", ");
        }
        message.delete(message.length() - 2, message.length());
        System.out.println(message);
    }

    public void takeBook(Practice_4.dop.Exercise_5.Book... books) {
        StringBuilder message = new StringBuilder(fio + " взял книги: ");
        for (Practice_4.dop.Exercise_5.Book book : books) {
            message.append(book.title).append(" (").append(book.author).append("), ");
        }
        message.delete(message.length() - 2, message.length());
        System.out.println(message);
    }

    public void returnBook(int count) {
        System.out.println(fio + " вернул " + count + " книги");
    }

    public void returnBook(String... titles) {
        StringBuilder message = new StringBuilder(fio + " вернул книги: ");
        for (String title : titles) {
            message.append(title).append(", ");
        }
        message.delete(message.length() - 2, message.length());
        System.out.println(message);
    }

    public void returnBook(Practice_4.dop.Exercise_5.Book... books) {
        StringBuilder message = new StringBuilder(fio + " вернул книги: ");
        for (Practice_4.dop.Exercise_5.Book book : books) {
            message.append(book.title).append(" (").append(book.author).append("), ");
        }
        message.delete(message.length() - 2, message.length());
        System.out.println(message);
    }
}