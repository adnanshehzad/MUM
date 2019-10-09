package Solution;

public final class SavingsAccount extends Account{
	public SavingsAccount(double balance, double interestRate) {
		this.balance = balance;
		this.interestRate = interestRate;
	}
	double balance;
	double interestRate;
	public double getBalance() {
		double newbalance = balance + interestRate * balance;
		return newbalance;
	}
	
	
}
