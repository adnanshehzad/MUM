
public class CSalaried extends CEmployee{
	private double salary;
	
	public double calcGrossPay(int month, int year) {
		return salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public CSalaried(int id, double salary) {
		super(id);
		this.salary = salary;
	}
	
}
