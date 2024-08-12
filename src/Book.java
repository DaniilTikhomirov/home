public class Book {
    private final Author author;
    private final String nameBook;
    private int yearBook;

    public Book(Author author, String nameBook, int yearBook) {
        this.author = author;
        this.nameBook = nameBook;
        this.yearBook = yearBook;

    }

    public Author getAuthor() {
        return author;
    }

    public String getNameBook() {
        return nameBook;
    }

    public int getYearBook() {
        return yearBook;
    }

    public void setYearBook(int yearBook) {
        this.yearBook = yearBook;
    }
}
