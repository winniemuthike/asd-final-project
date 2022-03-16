package banking.model;

import framework.model.Account;
import framework.model.Address;
import framework.model.Customer;
import framework.notification.EmailObserver;

import java.util.ArrayList;
import java.util.List;

public class PersonalAccount extends Customer {

    EmailObserver emailObserver;
    List<Account> myAccountList;
    private String birthdate;
    //return back
    private PersonalAccount PersonalAccount;

    public PersonalAccount(String name, String email, String birthdate, Address address) {
        super(name, email, address);

        this.birthdate = birthdate;
        myAccountList = new ArrayList<>();
    }
/*When a deposit or withdrawal is done to a personal account, and the amount was larger than $500
or the resulting amount is negative, the bank sends the person an Email about the transaction. */

    public void withdraw(double amount) {
        if (getAccounts().equals(PersonalAccount) && amount > 500)
            emailObserver.notifyAll();//notifyObservers("Transaction over 500$");
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
    //added
    @Override
    public void setAccounts(List<Account> accounts) {
        myAccountList.add((Account) accounts);
    }
}