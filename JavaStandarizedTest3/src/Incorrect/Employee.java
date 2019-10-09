package Incorrect;

import java.util.List;

public class Employee {
	public Employee(String id, List accounts) {
		this.id = id;
		this.accounts = accounts;
	}
	String id;
	List accounts;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List getAccounts() {
		return accounts;
	}
	public void setAccounts(List accounts) {
		this.accounts = accounts;
	}
}
