package prob2;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	List<Account> Laccount=new ArrayList<Account>();
	
	public String getName()
	{
		return name;
	}
	public void addAccount(Account acc)
	{
		Laccount.add(acc);
	}
	public double computeUpdatedBalanceSum() {
		double sum=0;
		for(Account acc:Laccount)
		{
			sum+=acc.computeUpdatedBalance();
		}
		return sum;
	}
	public Employee(String name) {
		super();
		this.name = name;
	}
}
