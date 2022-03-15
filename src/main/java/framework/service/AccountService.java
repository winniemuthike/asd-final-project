package framework.service;

import framework.model.Account;
import framework.model.AccountType;
import framework.model.Address;

import java.util.Collection;

public interface AccountService {
    Account createAccount(String accountNumber, String customerName, String email,
                          Address customerAddress, AccountType accountType);
    Account getAccount(String accountNumber);
    Collection<Account> getAllAccounts();
    void deposit (String accountNumber, double amount);
    void withdraw (String accountNumber, double amount);
    void transferFunds(String fromAccountNumber, String toAccountNumber, double amount, String description);
    void addInterest(String accountNumber);
}
