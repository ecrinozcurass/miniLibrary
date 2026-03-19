public class Main {
    public static void main(String[] args) {

        Library library = new Library(10);

        Book b1 = new Book("1984", "Orwell", 328, true);
        Book b2 = new Book("Hobbit", "Tolkien", 310, true);
        Book b3 = new Book("Harry Potter", "Rowling", 500, true);

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        Reader r1 = new Reader("Ali", "Yilmaz", 1, 0);

        System.out.println("---- Available Books ----");
        library.printAvailableBooks();

        library.borrowBook("1984", r1);

        System.out.println("---- After Borrow ----");
        library.printAvailableBooks();

        library.borrowBook("1984", r1);

        library.returnBook("1984", r1);

        System.out.println("---- After Return ----");
        library.printAvailableBooks();
    }
}