package creditcard.model;

import framework.model.Customer;

public class BronzeCredit extends CreditCardAccount {

    public BronzeCredit(Customer customer, String accountNumber) {
        super(customer, accountNumber);
    }

    public BronzeCredit(Customer customer, String accountNumber, String ccNumber, String  expirationDate) {
        super(customer, accountNumber, ccNumber, expirationDate);
    }

    @Override
    public void addInterest() {

    }
}
