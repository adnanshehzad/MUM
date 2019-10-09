package prob2;

public class CheckingAccount extends Account{

	private double balance;
	private double monthlyfee;
	private String acctid;
	
	public CheckingAccount() {
	}
	
	public CheckingAccount(String acctid, double monthlyfee, double balance) {
		super();
		this.balance = balance;
		this.monthlyfee = monthlyfee;
		this.acctid = acctid;
	}

	public double getMonthlyfee() {
		return monthlyfee;
	}

	public void setMonthlyfee(double monthlyfee) {
		this.monthlyfee = monthlyfee;
	}

	public String getAcctid() {
		return acctid;
	}

	public void setAcctid(String acctid) {
		this.acctid = acctid;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String getAccountID() {
		// TODO Auto-generated method stub
		return acctid;
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	@Override
	public double computeUpdatedBalance() {
		// TODO Auto-generated method stub
		return balance-monthlyfee;
	}

}
