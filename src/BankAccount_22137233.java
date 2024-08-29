public class BankAccount_22137233 {
    private double balance;
    private String accountNumber;
    private String accountHolderName;

   
    public BankAccount_22137233(double initialBalance, String accountHolderName) {
        validateBalance(initialBalance);
        this.balance = initialBalance;
        //  generate a unique account number 
        this.accountNumber = generateAccountNumber();
        this.accountHolderName = accountHolderName;
    }

    // Constructor
    public BankAccount_22137233(double initialBalance) {
        this(initialBalance, null); // Call  constructor
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

    
    private String generateAccountNumber() {
       
        return "ACC" + (int) (Math.random() * 1000000);
    }
}