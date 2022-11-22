package hw11;

public class Book {
    private String bookName;
    Author author;
    private int publicationYear;
    public Book(String bookName, Author createAuthor, int publicationYear) {
        this.bookName = bookName;
        this.author = createAuthor;
        this.publicationYear = publicationYear;

    }
    public String getBookName() {
        return this.bookName;
    }
    public int getPublicationYear() {
        return this.publicationYear;
    }
    public void setPublicationYear (int publicationYear) {
        this.publicationYear = publicationYear;
    }
}

