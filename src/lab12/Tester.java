package lab12;

public class Tester {
    public static void main(String[] args) {

        Book book1 = new Book("Aaa", "John", "Pubi", 1995);
        Book book2 = new Book("Aaa", "John", "Pubi", 1995);
        Book book3 = new Book("Bbb", "John", "Pubi", 2000);

        Library library = new Library(new Book[]{book1, book2, book3});

        System.out.println(library.books[0] + " equals " + library.books[1] + "? " + library.books[0].equals(library.books[1]));
        System.out.println(library.books[1] + " equals " + library.books[2] + "? " + library.books[1].equals(library.books[2]));
    }
}
