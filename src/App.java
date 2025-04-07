public class App {
    public static void main(String[] args) {
        Author nikolayNosov = new Author("Николай", "Носов");
        Author nikolayNosov2 = new Author("Николай", "Носов");
        Author margaretMitchel = new Author("Маргарет", "Митчел");

        Book bookFirst = new Book("Незнайка в солнечном городе", nikolayNosov, 2005);
        Book bookThird = new Book("Незнайка в солнечном городе", nikolayNosov2, 2005);
        Book bookSecond = new Book("Унесенные ветром", margaretMitchel, 2003);

        System.out.println(bookFirst.getBookTitle());
        System.out.println(bookFirst.getYearOfPublication());
        System.out.println("Автор " + nikolayNosov.getBookAuthorName() + " " + nikolayNosov.getBookAuthorSurname());
        bookSecond.setYearOfPublication(1965);
        System.out.println("bookSecond.getYearOfPublication() = " + bookSecond.getYearOfPublication());

        System.out.println(bookFirst);
        System.out.println(bookFirst.hashCode());
        System.out.println(bookThird.hashCode());
        System.out.println("bookFirst.equal s(bookThird) = " + bookFirst.equals(bookThird));

    }
}
