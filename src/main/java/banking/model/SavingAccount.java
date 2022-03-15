package banking.model;

import framework.model.Account;

public class SavingAccount extends Account {

    public SavingAccount(String accountNumber) {
        super(accountNumber);
    }

    @Override
    public void addInterest() {
    }
}
