package creditcard.model;

import framework.model.Customer;

public class SilverCredit extends CreditCardAccount {

    public SilverCredit(Customer customer, String accountNumber) {
        super(customer, accountNumber);
    }

    public SilverCredit(Customer customer, String accountNumber, String ccNumber, String  expirationDate) {
        super(customer, accountNumber, ccNumber, expirationDate);
    }

    @Override
    public void addInterest() {

    }
}
