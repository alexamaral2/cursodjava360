package app;

import account.Account3;
import account.InsufficientFoundsException;

public class App5 {
    public static void main(String[] args) {

        Account3 account = new Account3("1234");
        account.deposit(500);
        System.out.println(account.toString());

        try {
            account.withdraw(200);
            System.out.println(account.toString());
        } catch (InsufficientFoundsException e) {
            System.out.println("Insufficient funds: " + e.getMessage());
        }

    }
}
