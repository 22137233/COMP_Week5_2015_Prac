import java.time.LocalDate;
public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean available; // Using "available" instead of "isAvailable" for a slight variation
    private String borrowerName; // Tracks who borrowed the book (null if available)
    private LocalDate borrowDate; // Tracks borrow date (null if available)

    // Constructor with all attributes
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = true; // Default availability
    }

    // Getter and setter methods (unchanged for brevity)
    // ...

    // Method to check out the book, handling unavailable scenarios
    public boolean checkout(String borrowerName) {
        if (available) {
            this.available = false;
            this.borrowerName = borrowerName;
            this.borrowDate = LocalDate.now(); // Record borrow date
            System.out.println("The book \"" + title + "\" has been checked out to " + borrowerName + ".");
            return true;
        } else {
            System.out.println("The book \"" + title + "\" is currently not available.");
            return false;
        }
    }

    // Method to return the book, handling non-borrowed scenarios
    public boolean returnBook() {
        if (!available) {
            this.available = true;
            this.borrowerName = null;
            this.borrowDate = null; // Clear borrow details
            System.out.println("The book \"" + title + "\" has been returned.");
            return true;
        } else {
            System.out.println("The book \"" + title + "\" was not checked out.");
            return false;
        }
    }

    // Method to display book details, including availability and borrow information (if applicable)
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Available: " + available);
        if (!available) {
            System.out.println("Borrowed by: " + borrowerName);
            System.out.println("Borrowed on: " + borrowDate);
        }
    }
}