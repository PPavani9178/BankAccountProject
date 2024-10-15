class BankAccount {
    constructor(accountNumber, accountHolderName, initialBalance = 0) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Method to deposit money into the account
    deposit(amount) {
        if (amount <= 0) {
            throw new Error('Deposit amount must be positive.');
        }
        this.balance += amount;
    }

    // Method to withdraw money from the account
    withdraw(amount) {
        if (amount <= 0) {
            throw new Error('Withdrawal amount must be positive.');
        }
        if (amount > this.balance) {
            throw new Error('Insufficient balance.');
        }
        this.balance -= amount;
    }

    // Method to check if withdrawal is possible
    canWithdraw(amount) {
        return amount <= this.balance;
    }

    // Method to transfer money to another account
    transferTo(targetAccount, amount) {
        if (!targetAccount) {
            throw new Error('Target account cannot be null.');
        }
        if (this.canWithdraw(amount)) {
            this.withdraw(amount);
            targetAccount.deposit(amount);
        } else {
            throw new Error('Transfer failed due to insufficient funds.');
        }
    }

    // Getter for balance
    getBalance() {
        return this.balance;
    }

    // Time Complexity:
    // deposit() - O(1)
    // withdraw() - O(1)
    // canWithdraw() - O(1)
    // transferTo() - O(1)

    // Space Complexity:
    // O(1) for all methods as no additional space is used
}

module.exports = BankAccount;
