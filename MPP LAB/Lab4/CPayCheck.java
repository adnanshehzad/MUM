
public final class CPayCheck {
	private double grossPay;
	private double fica;
	private double state;
	private double local;
	private double medicare;
	private double socialSecurity;
	
	public void print() {
		System.out.println("Paycheck:");
		System.out.println("GrossPay: $ " + getGrossPay());
		System.out.println("NetPay: $ " + getNetPay() + "\n");
	}

	public double getGrossPay() {
		return grossPay;
	}

	public double getFica() {
		return fica;
	}

	public double getState() {
		return state;
	}

	public double getLocal() {
		return local;
	}

	public double getMedicare() {
		return medicare;
	}

	public double getSocialSecurity() {
		return socialSecurity;
	}
	
	public double getNetPay() {
		return grossPay * (1-(fica - state - local - medicare - socialSecurity));
	}

	public CPayCheck(double grossPay, double fica, double state, double local, double medicare, double socialSecurity) {
		super();
		this.grossPay = grossPay;
		this.fica = fica;
		this.state = state;
		this.local = local;
		this.medicare = medicare;
		this.socialSecurity = socialSecurity;
	}
	



}
