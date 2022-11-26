import java.util.Objects;

public class Book { private String bookName;
    private Author author;
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

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String toString() {
        return this.bookName + ". " + this.author + ". " + this.publicationYear;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.bookName});
    }

    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        } else {
            Book javaDLyaChaynikov = (Book)other;
            return this.bookName.equals(javaDLyaChaynikov.bookName);
        }
    }
}


