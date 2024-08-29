import java.time.LocalDate;
public class Book_22137233 {
    private String title;
    private String author;
    private String isbn;
    private boolean available; 
    private String borrowerName; 
    private LocalDate borrowDate; 

    // Constructor 
    public Book_22137233(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = true; 
    }

    
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

    // Method to return the book
    public boolean returnBook() {
        if (!available) {
            this.available = true;
            this.borrowerName = null;
            this.borrowDate = null; 
            System.out.println("The book \"" + title + "\" has been returned.");
            return true;
        } else {
            System.out.println("The book \"" + title + "\" was not checked out.");
            return false;
        }
    }

    // Method to display book details
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