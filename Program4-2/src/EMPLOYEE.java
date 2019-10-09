import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;


public class EMPLOYEE {
	
	private String name;
	private double salary;
	private GregorianCalendar cal;
	private ACCOUNT savingAccts;
	private ACCOUNT checkingAccts;
	private ACCOUNT retirementAccts;
	private Date hireDate;
	
	public EMPLOYEE() {
		// TODO Auto-generated constructor stub
	}
	//constructor
	public EMPLOYEE(String name, int yearOfHire, 
			int monthOfHire, int dayOfHire){
					this.name = name;
					GregorianCalendar cal = 
			new GregorianCalendar(yearOfHire,monthOfHire-1,dayOfHire);
					hireDate = cal.getTime();
		}


	// instance methods
	public String getName() {
	return name;
	}
	
	public double getSalary() {
	return salary;
	}

	//needs to be improved!!
	public Date getHireDay() {
	return cal.getTime();
	}

	public void raiseSalary(double byPercent) {
	double raise = salary * byPercent / 100;
	salary += raise;
	}
	
	public double yearlyFederalTax()
	{
		double tax=0.0d;
		if(salary>26000 && salary<=50000)
		{
			tax=(salary*20)/100;
		}
		else if(salary>50000 && salary<=80000)
		{
			tax=(salary*24)/100;
		}
		else if(salary>80000 )
		{
			tax=(salary*28)/100;
		}
		
		return tax;
	}
	
	public void createNewChecking(double startAmount) {
		// implement
		checkingAccts=new ACCOUNT(this,AccountType.CHECKING,startAmount);
	}
	public void createNewSavings(double startAmount) {
		// implement
		savingAccts=new ACCOUNT(this,AccountType.SAVINGS,startAmount);
	}
	public void createNewRetirement(double startAmount) {
		// implement
		retirementAccts=new ACCOUNT(this,AccountType.RETIREMENT,startAmount);
	}

	public void deposit(AccountType acctType, double amt){
		// implement
		switch(acctType)
		{
		case CHECKING:
			checkingAccts.makeDeposit(amt);
			break;
		case SAVINGS:
			savingAccts.makeDeposit(amt);
			break;
		case RETIREMENT:
			retirementAccts.makeDeposit(amt);
			break;
		}
	}
	public boolean withdraw(AccountType acctType, double amt){
		// implement
		boolean result=false;
		switch(acctType)
		{
		case CHECKING:
			result=checkingAccts.makeWithdrawal(amt);
			break;
		case SAVINGS:
			result=savingAccts.makeWithdrawal(amt);
			break;
		case RETIREMENT:
			result=retirementAccts.makeWithdrawal(amt);
			break;
		}
		return result;
		
	}

	@SuppressWarnings("null")
	public String getFormattedAcctInfo() {
		// implement
		StringBuilder strbuild=new StringBuilder();
		ArrayList<ACCOUNT> account=new ArrayList<>();
		
		account.add(checkingAccts);
		account.add(savingAccts);
		account.add(retirementAccts);
		
		for(ACCOUNT acc:account)
		{
			strbuild.append(acc);
		}
		return strbuild.toString();
	}

	
}
