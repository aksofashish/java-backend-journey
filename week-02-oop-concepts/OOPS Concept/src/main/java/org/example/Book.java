package org.example;

/**
 * Book class represents a book in the library system
 */
public class Book {
    // Instance variables
    private String title;
    private String author;
    private String isbn;
    private int year;
    private boolean isAvailable;

    /**
     * Constructor to create a new Book
     * @param title The book's title
     * @param author The book's author
     * @param isbn The book's ISBN
     * @param year Publication year
     */
    public Book(String title, String author, String isbn, int year) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.year = year;
        this.isAvailable = true; // By default, a new book is available
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getYear() {
        return year;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Setter for availability
    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    /**
     * Display book information
     */
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Year: " + year);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }

    /**
     * String representation of the book
     */
    @Override
    public String toString() {
        return "\"" + title + "\" by " + author + " (" + year + ")"
                + " - ISBN: " + isbn
                + " - Available: " + (isAvailable ? "Yes" : "No");
    }
}