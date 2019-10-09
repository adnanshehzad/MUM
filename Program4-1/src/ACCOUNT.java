
public class ACCOUNT {
	
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AccountType acctType;
	private EMPLOYEE employee;
	
	public ACCOUNT() {
		// TODO Auto-generated constructor stub
	}

	ACCOUNT(EMPLOYEE emp, AccountType acctType, double balance){
		employee = emp;
		this.acctType =acctType;
		this.balance = balance;
		}

		ACCOUNT(EMPLOYEE emp, AccountType acctType){
		this(emp,acctType,DEFAULT_BALANCE);
		}
		public String toString() {
		return "type = "+acctType+", balance = "+balance;
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
			switch(acctType)
			{
			case CHECKING:
				interest=balance*0.02;
				break;
			case SAVINGS:
				interest=balance*0.04;
				break;
			case RETIREMENT:
				interest=balance*0.05;
				break;
			}
			
			return interest;
		}
		
}

