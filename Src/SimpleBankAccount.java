public interface SimpleBankAccount extends SimpleBankAccountKernel {

    /**
     * Checks if the account has enough money.
     *
     * @param amount amount to check
     * @return true if enough funds exist
     * @ensures hasEnough = (balance >= amount)
     */
    boolean hasEnough(int amount);

    /**
     * Transfers money to another account.
     *
     * @param other the account to transfer to
     * @param amount amount to transfer
     * @updates this, other
     * @requires amount > 0 && this.balance >= amount
     * @ensures this.balance = #this.balance - amount
     *          && other.balance = #other.balance + amount
     */
    void transferTo(SimpleBankAccount other, int amount);
}