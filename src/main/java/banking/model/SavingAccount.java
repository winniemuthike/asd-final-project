package banking.model;

import framework.model.Account;
import framework.model.Customer;

public class SavingAccount extends Account {
    public static final Double INTEREST_RATE = 0.05;
    public SavingAccount(Customer customer, String accountNumber) {
        super(customer, accountNumber);
    }

    @Override
    public void addInterest() {
        double currentBalance = this.getBalance();
        double interest = currentBalance* INTEREST_RATE;
        this.deposit(interest);
    }

}
