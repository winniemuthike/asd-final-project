package banking.model;

import framework.model.Account;
import framework.model.Customer;

public class CheckingAccount extends Account {

    public CheckingAccount(Customer customer, String accountNumber) {
        super(customer, accountNumber);
    }

    @Override
    public void addInterest() {

    }


}
