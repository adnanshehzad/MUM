package Solution;

public final class CheckingAccount extends Account{
	public CheckingAccount(double balance) {
		this.balance = balance;
	}
	double balance;
	public double getBalance() {
		return balance;
	}
}
