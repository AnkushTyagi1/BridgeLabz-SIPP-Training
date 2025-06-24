class Book {
    public String ISBN;
    protected String title;
    private String author;

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

class DigitalBook extends Book {
    public void displayDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
    }
}

public class BookDemo {
    public static void main(String... args) {
        DigitalBook ebook = new DigitalBook();
        ebook.ISBN = "978-0134685991";
        ebook.title = "Effective Java";
        ebook.setAuthor("Joshua Bloch");

        ebook.displayDetails();
        System.out.println("Author: " + ebook.getAuthor());
    }
}
