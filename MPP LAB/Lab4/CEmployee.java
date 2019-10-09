
public abstract class CEmployee {
	private int empId;
	
	public CEmployee(int id) {
		empId=id;
	}

	public void print() {
		System.out.println("Employee " + empId);
		System.out.println("Compensation");
		calcCompensation(9, 2019).print();
	}
	
	public CPayCheck calcCompensation(int month, int year) {
		return new CPayCheck(calcGrossPay(month, year), 0.23d, 0.05d, 0.01d, 0.03d, 0.075);
	}
	
	public abstract double calcGrossPay(int month, int year);

}
