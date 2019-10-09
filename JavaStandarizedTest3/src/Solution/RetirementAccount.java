package Solution;

import java.time.LocalDate;

public final class RetirementAccount extends Account{
	public RetirementAccount(double balance, LocalDate creationDate) {
		this.balance = balance;
		this.creationDate = creationDate;
	}
	double balance;
	LocalDate creationDate;
	public double getBalance() {
		double newbalance = balance - earlyWithdrawalFee();
		return newbalance < 0 ? 0: newbalance;
	}
	
	private double earlyWithdrawalFee() {
		return 50;
	}
}
