package account;

public class InsufficientFoundsException extends Exception {

    private final double currentBalance;

    public InsufficientFoundsException(double currentBalance) {
        super("There is no sufficient funds to withdraw");
        this.currentBalance = currentBalance;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }
}
