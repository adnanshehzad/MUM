
public class ACCOUNT {
	//public final static String CHECKING = "checking";
	//public final static String SAVINGS = "savings";
	//public final static String RETIREMENT = "retirement";
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AccountType acctType;
	private EMPLOYEE employee;

	public ACCOUNT() {
		// TODO Auto-generated constructor stub
	}
	
	ACCOUNT(EMPLOYEE emp, AccountType checking2, double balance){
		employee = emp;
		this.acctType =checking2;
		this.balance = balance;
		}

		ACCOUNT(EMPLOYEE emp, AccountType acctType){
		this(emp,acctType,DEFAULT_BALANCE);
		}
		public String toString() {
			String str;
			str="Account Info for" + employee.getName() + ":\n \n" + "\n" + "Current Balance: " + this.getBalance() + "\n";
			return str;
		}
		public void makeDeposit(double deposit) {
		//implement
			balance+=deposit;
		}
		public boolean makeWithdrawal(double amount) {
		//implement
			if(amount>balance)
			{
				return false;
			}
			else {
				balance-=amount;
				return true;
			}
		}
		
		
		public double getBalance()
		{
			return balance;
		}
		
		public double computeInterest()
		{
			double interest=0.0;
			if(acctType==AccountType.CHECKING)
			{
				interest=balance*0.02;
			}
			else if(acctType==AccountType.SAVINGS)
			{
				interest=balance*0.04;
			}
			else if(acctType==AccountType.RETIREMENT)
			{
				interest=balance*0.05;
			}
			else
			{
				System.out.println("Invalid Account Type");
			}
			return interest;
		}
}
