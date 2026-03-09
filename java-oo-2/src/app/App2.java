package app;

import account.SavingsAccount;

public class App2 {

    public static void main(String[] args) {
        SavingsAccount a1 = new SavingsAccount("1234");
        System.out.println(a1.getNumber());
    }
}
