
public class Secretary extends DeptEmployee{
	private double overtimehours;
	public Secretary() {
		// TODO Auto-generated constructor stub
	}
	public Secretary(double overtime) {
		overtimehours=overtime;
	}
	
	public void setOverTimeHours(double over)
	{
		overtimehours=over;
	}
	public double getOverTimeHours()
	{
		return overtimehours;
	}
	@Override
	public double computeSalary()
	{
		double result=super.computeSalary()+(12*overtimehours);
		return result;
	}
}
