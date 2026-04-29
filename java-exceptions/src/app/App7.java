package app;

import account.Account3;
import account.InsufficientFoundsException;

public class App7 {
    public static void main(String[] args) {

        Account3 account = new Account3("1234");
        account.deposit(500);
        System.out.println(account.toString());

        try {
            account.withdraw(-600);
            System.out.println(account.toString());
        } catch (InsufficientFoundsException | IllegalArgumentException e) {
            System.out.println("ERRO: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("THE END!");
    }
}
