package org.example;

public class Main {
    public static void main(String[] args) {
        // Create a library
        Library library = new Library("City Central Library");

        // Add some books
        Book b1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "1111", 1925);
        Book b2 = new Book("To Kill a Mockingbird", "Harper Lee", "2222", 1960);
        Book b3 = new Book("1984", "George Orwell", "3333", 1949);
        Book b4 = new Book("Animal Farm", "George Orwell", "4444", 1945);

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);
        library.addBook(b4);

        // List all books
        library.listAllBooks();

        // Search by title
        System.out.println("\nSearching for '1984'...");
        Book foundBook = library.searchByTitle("1984");
        if (foundBook != null) {
            System.out.println("Found: " + foundBook);
        } else {
            System.out.println("Book not found.");
        }

        // Search by author
        System.out.println("\nSearching for books by 'George Orwell'...");
        for (Book book : library.searchByAuthor("George Orwell")) {
            System.out.println(book);
        }

        // Checkout a book
        System.out.println("\nChecking out '1984'...");
        library.checkoutBook("3333");

        // List available books after checkout
        library.listAvailableBooks();

        // Try returning a book
        System.out.println("\nReturning '1984'...");
        library.returnBook("3333");

        // Display library statistics
        library.displayStatistics();

        // Remove a book
        System.out.println("\nRemoving 'The Great Gatsby'...");
        library.removeBook("1111");

        // Final list
        library.listAllBooks();
    }
}