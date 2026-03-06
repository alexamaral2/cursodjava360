package br.com.javainsider.app;

import br.com.javainsider.account.Account;
import br.com.javainsider.account.EncapsulatedAccount;
import br.com.javainsider.account.IdGeneratedAccount;

public class App9 {
    public static void main(String[] args) {
        Account a = new Account();
        Account b = new Account();

        EncapsulatedAccount d = new EncapsulatedAccount("1234");
        IdGeneratedAccount e = new IdGeneratedAccount("Paulo");
    }
}
