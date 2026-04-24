import static org.junit.Assert.*;
import org.junit.Test;

public class SimpleBankAccountTest {

    @Test
    public void testHasEnough() {
        SimpleBankAccount1L acc = new SimpleBankAccount1L();
        acc.deposit(200);
        assertTrue(acc.hasEnough(100));
    }

    @Test
    public void testTransfer() {
        SimpleBankAccount1L acc1 = new SimpleBankAccount1L();
        SimpleBankAccount1L acc2 = new SimpleBankAccount1L();

        acc1.deposit(300);
        acc1.transferTo(acc2, 100);

        assertEquals(200, acc1.getBalance());
        assertEquals(100, acc2.getBalance());
    }
}