package creditcard.model;

import framework.model.Customer;

public class GoldCredit extends CreditCard {

    public GoldCredit(Customer customer, String accountNumber, String ccNumber, String  expirationDate) {
        super(customer, accountNumber, ccNumber, expirationDate);
    }

    @Override
    public void addInterest() {

    }
}
