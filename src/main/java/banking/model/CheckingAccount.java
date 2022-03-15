package banking.model;

import framework.model.Account;

public class CheckingAccount extends Account {

    public CheckingAccount(String accountNumber) {
        super(accountNumber);
    }

    @Override
    public void addInterest() {
        double amount = this.getBalance();

        if(amount < 1000)
            this.deposit(amount * 0.015);
        else
            this.deposit(amount * 0.025);
    }
}
