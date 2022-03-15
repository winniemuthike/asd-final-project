package framework.model;

import java.util.List;

public class Customer {

	private String name;
	List<Account> accounts;

	public Customer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
