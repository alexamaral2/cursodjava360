package app;

import account.Account3;
import account.InsufficientFoundsException;

public class App9 {

    public static void main(String[] args) throws Exception {

        Account3 account = new Account3("1234");
        account.deposit(500);
        System.out.println(account);

        try {
            account.withdraw(600);
        } finally {
            System.out.println("THE END");
        }
    }
}
