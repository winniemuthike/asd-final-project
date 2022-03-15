package creditcard.model;

import framework.model.Customer;

public class SilverCredit extends CreditCard {

    public SilverCredit(Customer customer, String accountNumber) {
        super(customer, accountNumber);
    }

    @Override
    public void addInterest() {

    }
}
