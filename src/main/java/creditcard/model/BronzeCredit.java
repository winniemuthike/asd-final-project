package creditcard.model;

import framework.model.Customer;

public class BronzeCredit extends CreditCard {


    public BronzeCredit(Customer customer, String accountNumber) {
        super(customer, accountNumber);
    }

    @Override
    public void addInterest() {

    }
}
