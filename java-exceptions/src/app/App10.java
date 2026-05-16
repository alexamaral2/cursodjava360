package app;

import account.Account3;
import account.AccountService;
import account.ServiceException;

public class App10 {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();

        try {
            accountService.createWithdraw("1234", 1200);
        } catch (ServiceException e) {
           e.printStackTrace();
        }
    }
}
