package Practice_2.Exercise_7;

public class Book {
    int year;
    String name;
    String author;

    public Book(int year, String name, String author) {
        this.year = year;
        this.name = name;
        this.author = author;
    }
    public Book() {
        this.year = 0;
        this.name = "";
        this.author = "";
    }
    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    @Override
    public String toString() {
        return "Book{" +
                "name = " + name +
                ", author = " + author +
                ", year = " + year + '\'' +
                '}';
    }
}
