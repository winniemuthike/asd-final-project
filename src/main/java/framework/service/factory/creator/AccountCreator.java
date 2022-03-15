package framework.service.factory.creator;

import framework.model.Account;
import framework.model.Customer;

public abstract class AccountCreator {
    public abstract Account CreatAccount(Customer customer, String accountNumber);
}
