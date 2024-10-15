import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    public void setUp() {
        account = new BankAccount("12345", "John Doe", 1000.0);
    }

    @Test
    public void testDeposit() {
        account.deposit(500.0);
        assertEquals(1500.0, account.getBalance());
    }

    @Test
    public void testWithdraw() {
        account.withdraw(300.0);
        assertEquals(700.0, account.getBalance());
    }

    @Test
    public void testCanWithdraw() {
        assertTrue(account.canWithdraw(300.0));
        assertFalse(account.canWithdraw(1200.0));
    }

    @Test
    public void testTransferTo() {
        BankAccount targetAccount = new BankAccount("67890", "Jane Doe", 500.0);
        account.transferTo(targetAccount, 200.0);
        assertEquals(800.0, account.getBalance());
        assertEquals(700.0, targetAccount.getBalance());
    }

    @Test
    public void testInsufficientFunds() {
        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(1200.0);
        });
    }
}
