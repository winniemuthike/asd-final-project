package creditcard.model;

import framework.model.Account;
import framework.model.Customer;

public abstract class CreditCard extends Account {

    private String ccNumber;
    private String  expirationDate;

    public CreditCard(Customer customer, String accountNumber, String ccNumber, String  expirationDate) {
        super(customer, accountNumber);

        this.ccNumber = ccNumber;
        this.expirationDate = expirationDate;
    }

    public String getCcNumber() {
        return ccNumber;
    }

    public void setCcNumber(String ccNumber) {
        this.ccNumber = ccNumber;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
}
