public class SimpleBankAccount1L extends SimpleBankAccountSecondary {

    /*
     * Representation:
     * balance is the amount of money in the account
     */

    /*
     * Convention:
     * balance >= 0
     */

    /*
     * Correspondence:
     * this.balance represents the current account balance
     */
    private int balance;

    /**
     * Constructor
     */
    public SimpleBankAccount1L() {
        this.balance = 0;
    }

    /**
     * Deposits money into the account.
     */
    @Override
    public void deposit(int amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    /**
     * Withdraws money from the account.
     */
    @Override
    public void withdraw(int amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
        }
    }

    /**
     * Returns the current balance.
     */
    @Override
    public int getBalance() {
        return this.balance;
    }
}