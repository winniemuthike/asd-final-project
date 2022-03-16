package banking.model;

import framework.model.Account;
import framework.model.Customer;

public class SavingAccount extends Account {

    public SavingAccount(Customer customer, String accountNumber) {
        super(customer, accountNumber);
    }

    @Override
    public void addInterest() {

    }

}
