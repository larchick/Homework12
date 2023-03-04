public class Main {
    public static void main(String[] args) {

        Author author = new Author("Лев", "Толстой");
        Book book = new Book("Война и мир", author, 1867);

        Author author1 = new Author("Александр", "Островский");
        Book book1 = new Book("Гроза", author1, 1859);

        System.out.println(book1.getPublishingYear());

        book1.setPublishingYear(1900);
        System.out.println(book1.getPublishingYear());

    }
}