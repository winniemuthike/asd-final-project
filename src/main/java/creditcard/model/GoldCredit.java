package creditcard.model;

import framework.model.Customer;

public class GoldCredit extends CreditCard {

    public GoldCredit(Customer customer, String accountNumber) {
        super(customer, accountNumber);
    }

    @Override
    public void addInterest() {

    }
}
