public class BankAccount {
    private double balance;
    private String accountNumber;
    private String accountHolderName;

    // Constructor with initial balance and optional account holder name
    public BankAccount(double initialBalance, String accountHolderName) {
        validateBalance(initialBalance);
        this.balance = initialBalance;
        // You can generate a unique account number here
        this.accountNumber = generateAccountNumber();
        this.accountHolderName = accountHolderName;
    }

    // Constructor with initial balance only
    public BankAccount(double initialBalance) {
        this(initialBalance, null); // Call the other constructor
    }

    private void validateBalance(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount. Must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    // A simple method to generate a unique account number (you can replace this with a more sophisticated algorithm)
    private String generateAccountNumber() {
        // Replace with your desired account number generation logic
        return "ACC" + (int) (Math.random() * 1000000);
    }
}