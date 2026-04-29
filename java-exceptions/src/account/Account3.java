package account;

public class Account3 {

    private final String number;
    private double balance;

    public Account3(String number) {
        this.number = number;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFoundsException {
        if (amount < 0){
            throw new IllegalArgumentException("Amount cannot be negative");
        }

        if (this.balance - amount < 0) {
            throw new InsufficientFoundsException(balance);
        }

        this.balance -= amount;
    }

    @Override
    public String toString() {
        return "Account3{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                '}';
    }
}
