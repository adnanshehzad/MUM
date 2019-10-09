package Incorrect;

import java.util.List;

public class AccountManager {
	public static double computeAccountBalanceSum(List<Employee> emps) {
		double sum = 0;
		for(Employee e : emps) {
			List accounts = e.getAccounts();
			for(int i = 0; i < accounts.size(); ++i) {
				Object next = accounts.get(i);
				if(next instanceof SavingsAccount) {
					sum += ((SavingsAccount)next).getBalance();
				}
				else if(next instanceof CheckingAccount) {
					sum += ((CheckingAccount)next).getBalance();
				}
				else if(next instanceof RetirementAccount) {
					sum += ((RetirementAccount)next).getBalance();
				}
			}
		}
		return sum;
	}
}
