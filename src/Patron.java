public class Patron {
    private String name;
    private String id; // Using "id" instead of "patronId" for slight variation
    private int borrowedBooksCount; // More descriptive name for clarity

    public Patron(String name, String id) {
        this.name = name;
        this.id = id;
        this.borrowedBooksCount = 0; // Initially, no books borrowed
    }

    // Getter and setter methods (unchanged for brevity)
    // ...

    // Method to borrow a book, potentially handling borrowing limit
    public boolean borrowBook() {
        if (canBorrowMoreBooks()) {
            borrowedBooksCount++;
            System.out.println(name + " has borrowed a book. Total books borrowed: " + borrowedBooksCount);
            return true;
        } else {
            System.out.println(name + " cannot borrow more books at this time.");
            return false;
        }
    }

    // Method to return a book and prevent negative count
    public void returnBook() {
        if (borrowedBooksCount > 0) {
            borrowedBooksCount--;
            System.out.println(name + " has returned a book. Total books borrowed: " + borrowedBooksCount);
        } else {
            System.out.println(name + " has no books to return.");
        }
    }

    // Optional method to check if the patron can borrow more books (implement logic as needed)
    private boolean canBorrowMoreBooks() {
        // Implement logic to check borrowing limit (e.g., maximum books allowed)
        // Replace with your desired criteria for borrowing limit
        return true; // Placeholder for now, adjust based on your requirements
    }
}