package Solution;

import java.util.ArrayList;
import java.util.List;

public class AccountManager extends Employee{
	
	//List<Account> acc;
	public AccountManager(String id, List<Account> accounts) {
		super(id, accounts);
		// TODO Auto-generated constructor stub
	}

	public static double computeAccountBalanceSum(List<Employee> emps) {
		//implement
	
		double sum=0;
		List<Account> retlist=new ArrayList<Account>(); 
		for(Employee emp: emps)
		{
			retlist.addAll(emp.getAccounts());
		}
		//List<Account> retlist=new ArrayList<Account>(); 
		for(Account acc: retlist)
		{
			System.out.println("The balance for every employee is : " + acc.getBalance());
			sum+=acc.getBalance();
		}
		return sum;
	}
}
