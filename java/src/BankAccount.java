public class BankAccount {

    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        balance += amount;
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance.");
        }
        balance -= amount;
    }

    // Method to check balance sufficiency
    public boolean canWithdraw(double amount) {
        return amount <= balance;
    }

    // Method to transfer money from this account to another account
    public void transferTo(BankAccount targetAccount, double amount) {
        if (targetAccount == null) {
            throw new IllegalArgumentException("Target account cannot be null.");
        }
        if (this.canWithdraw(amount)) {
            this.withdraw(amount);
            targetAccount.deposit(amount);
        } else {
            throw new IllegalArgumentException("Transfer failed due to insufficient funds.");
        }
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Time Complexity:
    // deposit() - O(1)
    // withdraw() - O(1)
    // canWithdraw() - O(1)
    // transferTo() - O(1)

    // Space Complexity:
    // O(1) for all methods as no additional space is used
}
