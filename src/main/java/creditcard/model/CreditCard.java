package creditcard.model;

import framework.model.Account;
import framework.model.Customer;

public abstract class CreditCard extends Account {

    public CreditCard(Customer customer, String accountNumber) {
        super(accountNumber);
        this.setCustomer(customer);
    }
}
