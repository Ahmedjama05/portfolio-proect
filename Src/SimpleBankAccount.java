public class SimpleBankAccount {

    /*
     * balance represents the current amount of money in the account.
     * It must always be >= 0.
     */
    private int balance;

    /**
     * Constructor: creates a new account with starting balance 0.
     */
    public SimpleBankAccount() {
        this.balance = 0;
    }

    /**
     * Deposits money into the account.
     */
    public void deposit(int amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    /**
     * Withdraws money from the account if enough funds exist.
     */
    public void withdraw(int amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
        }
    }

    /**
     * Returns the current balance.
     */
    public int getBalance() {
        return this.balance;
    }

    /**
     * Returns true if the account has enough money.
     */
    public boolean hasEnough(int amount) {
        return this.balance >= amount;
    }

    /**
     * Transfers money from this account to another account.
     */
    public void transferTo(SimpleBankAccount other, int amount) {
        if (this.hasEnough(amount)) {
            this.withdraw(amount);
            other.deposit(amount);
        }
    }

    /**
     * Main method demonstrating the component.
     */
    public static void main(String[] args) {

        // Create two accounts
        SimpleBankAccount account1 = new SimpleBankAccount();
        SimpleBankAccount account2 = new SimpleBankAccount();

        // Deposit money
        account1.deposit(500);
        account2.deposit(200);

        System.out.println("Initial balances:");
        System.out.println("Account 1: $" + account1.getBalance());
        System.out.println("Account 2: $" + account2.getBalance());

        // Withdraw money
        account1.withdraw(100);
        System.out.println("\nAfter Account 1 withdraws $100:");
        System.out.println("Account 1: $" + account1.getBalance());

        // Check funds
        System.out.println("\nDoes Account 1 have enough for $300? "
                + account1.hasEnough(300));

        // Transfer money
        account1.transferTo(account2, 200);

        System.out.println("\nAfter transferring $200 from Account 1 to Account 2:");
        System.out.println("Account 1: $" + account1.getBalance());
        System.out.println("Account 2: $" + account2.getBalance());
    }
}