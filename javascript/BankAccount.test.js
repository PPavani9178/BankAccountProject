const BankAccount = require('./BankAccount');

describe('BankAccount', () => {
    let account;

    beforeEach(() => {
        account = new BankAccount('12345', 'John Doe', 1000);
    });

    test('should deposit money', () => {
        account.deposit(500);
        expect(account.getBalance()).toBe(1500);
    });

    test('should withdraw money', () => {
        account.withdraw(300);
        expect(account.getBalance()).toBe(700);
    });

    test('should check if withdrawal is possible', () => {
        expect(account.canWithdraw(300)).toBe(true);
        expect(account.canWithdraw(1200)).toBe(false);
    });

    test('should transfer money to another account', () => {
        const targetAccount = new BankAccount('67890', 'Jane Doe', 500);
        account.transferTo(targetAccount, 200);
        expect(account.getBalance()).toBe(800);
        expect(targetAccount.getBalance()).toBe(700);
    });

    test('should throw error on insufficient funds', () => {
        expect(() => {
            account.withdraw(1200);
        }).toThrow('Insufficient balance.');
    });
});
