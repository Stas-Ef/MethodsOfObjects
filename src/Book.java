public class Book {
    private String bookTitle;
    private Author author;
    private int yearOfPublication;

    public Book(String bookTitle, Author author, int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
        this.bookTitle = bookTitle;
        this.author = author;
    }

    public String getBookTitle() {
        return this.bookTitle;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String toString() {
        return "Название: " + this.bookTitle + ", Автор: " + author + ", Год публикаци: " + this.yearOfPublication;
    }

    public int hashCode() {
        return yearOfPublication + bookTitle.hashCode() + author.hashCode();
    }

    public boolean equals(Object object) {
        Book book = (Book) object;
        return bookTitle.equals(book.bookTitle) && yearOfPublication == book.yearOfPublication &&
                author.equals(book.author);
    }
}
