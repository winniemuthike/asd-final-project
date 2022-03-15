package creditcard.model;

import framework.model.Customer;

public class SilverCredit extends CreditCard {

    public SilverCredit(Customer customer, String accountNumber, String ccNumber, String  expirationDate) {
        super(customer, accountNumber, ccNumber, expirationDate);
    }

    @Override
    public void addInterest() {

    }
}
