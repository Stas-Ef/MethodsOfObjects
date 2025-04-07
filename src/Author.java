public class Author {
    private String bookAuthorName;
    private String bookAuthorSurname;

    public Author(String bookAuthorName, String bookAuthorSurname) {
        this.bookAuthorName = bookAuthorName;
        this.bookAuthorSurname = bookAuthorSurname;
    }

    public String getBookAuthorName() {
        return this.bookAuthorName;
    }

    public String getBookAuthorSurname() {
        return this.bookAuthorSurname;
    }

    public String toString() {
        return "Автор: " + bookAuthorSurname + " " + bookAuthorName;
    }

    public int hashCode() {
        return bookAuthorName.hashCode() + bookAuthorSurname.hashCode();
    }

    public boolean equals(Object object) {
        Author author = (Author) object;
        return bookAuthorName.equals(author.bookAuthorName) && bookAuthorSurname.equals(author.bookAuthorSurname);
    }
}
