
public class CHourly extends CEmployee{

	private double hourlyWage;
	private double hourPerWeek;
	public double getHourlyWage() {
		return hourlyWage;
	}
	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}
	public double getHourPerWeek() {
		return hourPerWeek;
	}
	public void setHourPerWeek(double hourPerWeek) {
		this.hourPerWeek = hourPerWeek;
	}
	public double calcGrossPay(int month, int year) {
		return 4*hourPerWeek*hourlyWage;
	}
	public CHourly(int id,double hourlyWage, double hourPerWeek) {
		super(id);
		this.hourlyWage = hourlyWage;
		this.hourPerWeek = hourPerWeek;
	}
	
}
