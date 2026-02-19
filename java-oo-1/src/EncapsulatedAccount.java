public class EncapsulatedAccount {
    private final String accountNumber;
    private final String accountOwner;
    private double balance;


    public EncapsulatedAccount(String accountNumber, String accountOwner, double balance) {
        this.accountNumber = accountNumber;
        this.accountOwner = accountOwner;
        this.balance = balance;
    }
    public EncapsulatedAccount(String accountNumber, double balance) {
        this(accountNumber, null, balance);
    }

    public EncapsulatedAccount(String accountNumber, String accountOwner) {
       this(accountNumber, accountOwner, 0);
    }

    public EncapsulatedAccount(String accountNumber) {
        this(accountNumber, null, 0);
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

    public double getBalance() {
        return balance;
    }

}
