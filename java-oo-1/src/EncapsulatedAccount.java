public class EncapsulatedAccount {
    private String accountNumber;
    private String accountOwner;
    private double balance;

    public EncapsulatedAccount() {
    }

    public EncapsulatedAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public EncapsulatedAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    boolean deposit(String amount){
        return deposit(Double.parseDouble(amount));
    }

    boolean withdraw(double amount) {
        if (amount > 0) {
            balance -= amount;
            return true;
        }
        return false;
    }

    void transfer(double amount, EncapsulatedAccount targetAccount) {
        withdraw(amount);
        targetAccount.deposit(amount);
    }

    void printBalance(){
        System.out.println("Balance: R$ " + balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public void setAccountOwner(String accountOwner) {
        if (!accountOwner.isBlank()) {
            this.accountOwner = accountOwner;
        }
    }

    public double getBalance() {
        return balance;
    }

}
