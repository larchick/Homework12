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
}
