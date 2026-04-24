public interface SimpleBankAccountKernel {

    /**
     * Deposits money into the account.
     *
     * @param amount amount to deposit
     * @updates this
     * @requires amount > 0
     * @ensures balance = #balance + amount
     */
    void deposit(int amount);

    /**
     * Withdraws money from the account.
     *
     * @param amount amount to withdraw
     * @updates this
     * @requires amount > 0 && amount <= balance
     * @ensures balance = #balance - amount
     */
    void withdraw(int amount);

    /**
     * Returns the current balance.
     *
     * @return current balance
     * @ensures getBalance = balance
     */
    int getBalance();
}