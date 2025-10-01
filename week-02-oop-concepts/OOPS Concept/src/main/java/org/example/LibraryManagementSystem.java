package org.example;

/**
 * Main class to test the Library Management System
 */
public class LibraryManagementSystem {

    public static void main(String[] args) {
        System.out.println("=== Welcome to Central Library ===\n");

        // Create a Library instance
        Library library = new Library("Central Library");

        // Create and add books
        Book book1 = new Book("Clean Code", "Robert C. Martin", "978-0132350884", 2008);
        Book book2 = new Book("Effective Java", "Joshua Bloch", "978-0134685991", 2018);
        Book book3 = new Book("Design Patterns", "Erich Gamma", "978-0201633610", 1994);
        Book book4 = new Book("Refactoring", "Martin Fowler", "978-0201485677", 1999);
        Book book5 = new Book("Head First Java", "Kathy Sierra", "978-0596009205", 2005);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        // Test listAllBooks()
        library.listAllBooks();

        // Test searchByTitle()
        System.out.println("\n=== Search for 'Clean Code' ===");
        Book found = library.searchByTitle("Clean Code");
        if (found != null) {
            System.out.println("Found: " + found);
        } else {
            System.out.println("Book not found.");
        }

        // Test searchByAuthor()
        System.out.println("\n=== Search for books by 'Martin' ===");
        for (Book b : library.searchByAuthor("Martin")) {
            System.out.println(b);
        }

        // Test checkoutBook()
        System.out.println("\n=== Checkout 'Effective Java' ===");
        library.checkoutBook("978-0134685991");

        // Test checkoutBook() on same book again (should fail)
        System.out.println("\n=== Checkout 'Effective Java' again ===");
        library.checkoutBook("978-0134685991");

        // Test returnBook()
        System.out.println("\n=== Return 'Effective Java' ===");
        library.returnBook("978-0134685991");

        // Test removeBook()
        System.out.println("\n=== Remove 'Head First Java' ===");
        library.removeBook("978-0596009205");

        // Test displayStatistics()
        library.displayStatistics();

        System.out.println("\n=== End of Library Management System Demo ===");
    }
}