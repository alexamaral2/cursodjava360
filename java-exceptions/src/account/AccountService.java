package account;

public class AccountService {

    public void createWithdraw(String accountNumber, int amount) throws ServiceException {
        Account3 account = new Account3("1234");
        account.deposit(1000);

        try {
            account.withdraw(amount);
        } catch (InsufficientFoundsException e) {
            throw new ServiceException("Error during withdraw", e);
        }
    }
}
