package banking.model;

import framework.model.Account;
import framework.model.Customer;

public class CheckingAccount extends Account {
public static final Double INTEREST_RATE = 0.06;
    public CheckingAccount(Customer customer, String accountNumber) {
        super(customer, accountNumber);
    }

    @Override
    public void addInterest() {
        double currentBalance = this.getBalance();
        System.out.println("currentBal:: " + currentBalance);
        double interest = currentBalance* INTEREST_RATE;
        System.out.println("intterest:: "+ interest);
        this.deposit(interest);
        getCustomer().getAccounts().forEach( account -> account.deposit(interest) );
this.getBalance();
    }

}
