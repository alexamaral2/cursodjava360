package app;

import account.Account3;
import account.InsufficientFoundsException;

public class App6 {
    public static void main(String[] args) {

        Account3 account = new Account3("1234");
        account.deposit(500);
        System.out.println(account.toString());

        try {
            account.withdraw(600);
            System.out.println(account.toString());
        } catch (InsufficientFoundsException e) {
            System.out.println("Insufficient funds: " + e.getMessage());
        } catch(IllegalArgumentException e) {
            System.out.println("Invalid amount: " + e.getMessage());
        }

        System.out.println("THE END!");
    }
}
