package framework.service.factory.concrete.banking;

import banking.model.SavingAccount;
import framework.model.Account;
import framework.model.Customer;
import framework.service.factory.creator.AccountCreator;

public class SavingAccountCreator extends AccountCreator {

    @Override
    public Account CreatAccount(Customer customer, String accountNumber) {
        return new SavingAccount(customer, accountNumber);
    }
}

