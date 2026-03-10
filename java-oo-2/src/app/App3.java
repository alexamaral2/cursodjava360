package app;

import account.Account;

public class App3 {
    public static void main(String[] args) {
        Account a = new Account();
        a.setOwner("Calos");
        a.setNumber("123");
        a.setBalance(1000);
        System.out.println(a.toString());
    }
}
