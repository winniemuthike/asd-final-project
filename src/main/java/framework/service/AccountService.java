package framework.service;

import framework.model.Account;
import framework.model.Address;

import java.util.Collection;

public interface AccountService {
    Account saveAccount(Account account);
    Account getAccount(String accountNumber);
    Collection<Account> getAllAccounts();
    void deposit (String accountNumber, double amount) throws Exception;
    void withdraw (String accountNumber, double amount);
    void transferFunds(String fromAccountNumber, String toAccountNumber, double amount, String description);
    void addInterest(String accountNumber);
}
