public class BankAccountDemo {
    public static void main(String[] args) {
        // Create a BankAccount with an initial balance and account holder name
        BankAccount account1 = new BankAccount(1000.0, "John Doe");

        // Display account details
        System.out.println("Account 1 Details:");
        System.out.println("Account Number: " + account1.getAccountNumber());
        System.out.println("Account Holder: " + account1.getAccountHolderName());
        System.out.println("Initial Balance: $" + account1.getBalance());

        // Perform transactions
        account1.deposit(500.0);
        System.out.println("After depositing $500: $" + account1.getBalance());

        account1.withdraw(200.0);
        System.out.println("After withdrawing $200: $" + account1.getBalance());

        // Create a BankAccount with only an initial balance
        BankAccount account2 = new BankAccount(500.0);

        // Display account details
        System.out.println("\nAccount 2 Details:");
        System.out.println("Account Number: " + account2.getAccountNumber());
        System.out.println("Account Holder: " + account2.getAccountHolderName());
        System.out.println("Initial Balance: $" + account2.getBalance());

        // Attempt to withdraw more than the balance
        account2.withdraw(800.0);
        System.out.println("After attempting to withdraw $800: $" + account2.getBalance());
    }
}