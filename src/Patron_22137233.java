public class Patron_22137233 {
    private String name;
    private String id; 
    private int borrowedBooksCount; 
    public Patron_22137233(String name, String id) {
        this.name = name;
        this.id = id;
        this.borrowedBooksCount = 0; // Initially, no books borrowed
    }

   
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
      
        return true; // Placeholder for now, adjust based on your requirements
    }
}