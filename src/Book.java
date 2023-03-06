import java.util.Objects;

public class Book {
    private String nameBook;
    private Author dataSurnameAuthor;
    private int publishingYear;

    public Book(String name, Author dataSurnameAuthor, int publishingYear) {
        this.nameBook = name;
        this.dataSurnameAuthor = dataSurnameAuthor;
        this.publishingYear = publishingYear;
    }

    public String getNameBook() {
        return nameBook;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public Author getDataSurnameAuthor() {
        return dataSurnameAuthor;
    }

    @Override
    public String toString() {
        return nameBook + ", " + dataSurnameAuthor + ", " + publishingYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return getPublishingYear() == book.getPublishingYear() && Objects.equals(getNameBook(), book.getNameBook()) && Objects.equals(getDataSurnameAuthor(), book.getDataSurnameAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNameBook(), getDataSurnameAuthor(), getPublishingYear());
    }
}
