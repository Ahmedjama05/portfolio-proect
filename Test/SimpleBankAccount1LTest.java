import static org.junit.Assert.*;
import org.junit.Test;

public class SimpleBankAccount1LTest {

    @Test
    public void testDeposit() {
        SimpleBankAccount1L acc = new SimpleBankAccount1L();
        acc.deposit(100);
        assertEquals(100, acc.getBalance());
    }

    @Test
    public void testWithdraw() {
        SimpleBankAccount1L acc = new SimpleBankAccount1L();
        acc.deposit(100);
        acc.withdraw(50);
        assertEquals(50, acc.getBalance());
    }

    @Test
    public void testGetBalance() {
        SimpleBankAccount1L acc = new SimpleBankAccount1L();
        assertEquals(0, acc.getBalance());
    }
}