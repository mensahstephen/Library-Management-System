package Library;

public class Book extends LibraryResource {

    private final String author;
    private final String ISBN;
    public Book(String title, int publicationYear, String author, String ISBN) {
        super(title, publicationYear);
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    @Override
    public String getInfo() {
        return "Book: \n" +
                "Title: " + getTitle() + "\n" +
                "Publication Year: " + getYear() + "\n" +
                "Author: " + getAuthor() + "\n" +
                "ISBN: " + getISBN() + "\n";
    }

}
