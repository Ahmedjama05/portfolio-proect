public abstract class SimpleBankAccountSecondary
        implements SimpleBankAccount {

    @Override
    public boolean hasEnough(int amount) {
        return this.getBalance() >= amount;
    }

    @Override
    public void transferTo(SimpleBankAccount other, int amount) {
        if (this.hasEnough(amount)) {
            this.withdraw(amount);
            other.deposit(amount);
        }
    }

    @Override
    public String toString() {
        return "Balance: $" + this.getBalance();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SimpleBankAccount) {
            SimpleBankAccount other = (SimpleBankAccount) obj;
            return this.getBalance() == other.getBalance();
        }
        return false;
    }
}