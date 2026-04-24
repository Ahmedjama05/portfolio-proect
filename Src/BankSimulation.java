public class BankSimulation {
    public static void main(String[] args) {
        SimpleBankAccount1L a = new SimpleBankAccount1L();
        SimpleBankAccount1L b = new SimpleBankAccount1L();

        a.deposit(1000);
        a.transferTo(b, 300);

        System.out.println("A: $" + a.getBalance());
        System.out.println("B: $" + b.getBalance());
    }
}