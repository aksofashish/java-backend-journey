package org.example;

import java.util.ArrayList;

/**
 * Library class manages a collection of books
 */
public class Library {
    // Instance variables
    private ArrayList<Book> books;
    private String libraryName;

    /**
     * Constructor to create a new Library
     * @param libraryName Name of the library
     */
    public Library(String libraryName) {
        this.books = new ArrayList<>();
        this.libraryName = libraryName;
    }

    /**
     * Add a book to the library
     * @param book The book to add
     */
    public void addBook(Book book) {
        books.add(book);
        System.out.println("✓ Added: " + book);
    }

    /**
     * Remove a book by ISBN
     * @param isbn The ISBN of the book to remove
     * @return true if removed, false if not found
     */
    public boolean removeBook(String isbn) {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getIsbn().equals(isbn)) {
                books.remove(i);
                System.out.println("✓ Removed book with ISBN: " + isbn);
                return true;
            }
        }
        System.out.println("✗ Book with ISBN " + isbn + " not found.");
        return false;
    }

    /**
     * Search for a book by title
     * @param title Title to search for
     * @return The book if found, null otherwise
     */
    public Book searchByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                return book;
            }
        }
        return null;
    }

    /**
     * Search for books by author
     * @param author Author name to search for
     * @return ArrayList of books by that author
     */
    public ArrayList<Book> searchByAuthor(String author) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().toLowerCase().contains(author.toLowerCase())) {
                result.add(book);
            }
        }
        return result;
    }

    /**
     * List all books in the library
     */
    public void listAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in library.");
            return;
        }
        System.out.println("\n=== All Books in " + libraryName + " ===");
        for (int i = 0; i < books.size(); i++) {
            System.out.println((i + 1) + ". " + books.get(i));
        }
    }

    /**
     * List only available books
     */
    public void listAvailableBooks() {
        boolean found = false;
        System.out.println("\n=== Available Books in " + libraryName + " ===");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No available books at the moment.");
        }
    }

    /**
     * Checkout a book
     * @param isbn ISBN of book to checkout
     * @return true if successful, false otherwise
     */
    public boolean checkoutBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                if (book.isAvailable()) {
                    book.setAvailable(false);
                    System.out.println("✓ Checked out: " + book.getTitle());
                    return true;
                } else {
                    System.out.println("✗ Book is already checked out: " + book.getTitle());
                    return false;
                }
            }
        }
        System.out.println("✗ Book with ISBN " + isbn + " not found.");
        return false;
    }

    /**
     * Return a book
     * @param isbn ISBN of book to return
     * @return true if successful, false otherwise
     */
    public boolean returnBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                if (!book.isAvailable()) {
                    book.setAvailable(true);
                    System.out.println("✓ Returned: " + book.getTitle());
                    return true;
                } else {
                    System.out.println("✗ Book was not checked out: " + book.getTitle());
                    return false;
                }
            }
        }
        System.out.println("✗ Book with ISBN " + isbn + " not found.");
        return false;
    }

    /**
     * Display library statistics
     */
    public void displayStatistics() {
        int totalBooks = books.size();
        int availableCount = 0;

        for (Book book : books) {
            if (book.isAvailable()) {
                availableCount++;
            }
        }

        int checkedOutCount = totalBooks - availableCount;

        System.out.println("\n=== Library Statistics for " + libraryName + " ===");
        System.out.println("Total Books: " + totalBooks);
        System.out.println("Available: " + availableCount);
        System.out.println("Checked Out: " + checkedOutCount);
    }
}