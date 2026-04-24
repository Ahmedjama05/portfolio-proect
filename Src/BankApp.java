public class BankApp {
    public static void main(String[] args) {
        SimpleBankAccount1L acc = new SimpleBankAccount1L();
        acc.deposit(500);
        acc.withdraw(200);

        System.out.println("Balance: $" + acc.getBalance());
    }
}