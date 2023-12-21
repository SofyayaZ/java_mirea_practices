package Practice_6.Exercises_6789;

public class Main {
    public static void main(String[] args) {
        Printable[] books = new Printable[3];
        books[0] = new Book("The picture of Dorian Gray");
        books[1] = new Book("Pride and Justice");
        books[2] = new Book("Great Expectations");
        for (int i = 0; i < 3; i++) {
            books[i].print();
        }
    }
}
