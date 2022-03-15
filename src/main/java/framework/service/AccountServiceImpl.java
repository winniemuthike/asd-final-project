package framework.service;

import banking.model.CheckingAccount;
import banking.model.SavingAccount;
import banking.repository.AccountDAO;
import banking.repository.AccountDAOImpl;
import framework.model.Account;
import framework.model.AccountType;
import framework.model.Address;
import framework.model.Customer;

import java.util.Collection;

public class AccountServiceImpl implements AccountService {

	private AccountDAO accountDAO;
	
	public AccountServiceImpl(){
		accountDAO = new AccountDAOImpl();
	}

	public Account createAccount(String accountNumber, String customerName, String email,
								 Address customerAddress, AccountType accountType) {

		Customer customer = new Customer(customerName, email,  customerAddress);
		Account account = accountType == AccountType.Saving ? new SavingAccount(customer, accountNumber) :
				new CheckingAccount(customer, accountNumber);

		account.setCustomer(customer);
		
		accountDAO.saveAccount(account);
		
		return account;
	}

	public void deposit(String accountNumber, double amount) {
		Account account = accountDAO.loadAccount(accountNumber);
		account.deposit(amount);
		
		accountDAO.updateAccount(account);
	}

	public Account getAccount(String accountNumber) {
		Account account = accountDAO.loadAccount(accountNumber);
		return account;
	}

	public Collection<Account> getAllAccounts() {
		return accountDAO.getAccounts();
	}

	public void withdraw(String accountNumber, double amount) {
		Account account = accountDAO.loadAccount(accountNumber);
		account.withdraw(amount);
		accountDAO.updateAccount(account);
	}

	public void transferFunds(String fromAccountNumber, String toAccountNumber, double amount, String description) {
		Account fromAccount = accountDAO.loadAccount(fromAccountNumber);
		Account toAccount = accountDAO.loadAccount(toAccountNumber);
		fromAccount.transferFunds(toAccount, amount, description);
		accountDAO.updateAccount(fromAccount);
		accountDAO.updateAccount(toAccount);
	}

	@Override
	public void addInterest(String accountNumber) {
		Account account = accountDAO.loadAccount(accountNumber);
		account.addInterest();
	}
}
