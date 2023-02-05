package class19;

public class Book {
    String author;
    String title;
    int pages;
    int year;

    Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    Book(String author, String title, int pages, int year) {
        this(author, title);
        this.pages = pages;
        this.year = year;
    }

    void bookInfo() {
        System.out.println("Author " + author + " Title " + title
                + " number of pages " + pages + " year of publishing "
                + year);
    }

    void bookRecomend() {
        System.out.println("I strongly recomend to read " + title + " by " + author);
    }

    public static void main(String[] args) {

        Book book1 = new Book("Lev Tolstoy", "Anna Karenina", 400, 1877);
        book1.bookInfo();
        book1.bookRecomend();

        new StringBuilder();
        new StringBuilder("hello");
    }
}
