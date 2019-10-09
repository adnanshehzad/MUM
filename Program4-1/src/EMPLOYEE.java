import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;



public class EMPLOYEE {
	//instance fields
		private String name;
		private double salary;
		//private Date hireDay;
		private GregorianCalendar cal;
		
	public EMPLOYEE() {
		// TODO Auto-generated constructor stub
		
	}

		//constructor
		EMPLOYEE(String aName,double aSalary,int aYear,
		         int aMonth,int aDay) {
		
		name = aName;
		salary = aSalary;
		cal =new GregorianCalendar(aYear,aMonth-1,aDay);
		}

		// instance methods
		public String getName() {
		return name;
		}
		
		public double getSalary() {
		return salary;
		}

		//needs to be improved!!
		public Date getHireDay() {
		return cal.getTime();
		}

		public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
		}
		
		public double yearlyFederalTax()
		{
			double tax=0.0d;
			if(salary>26000 && salary<=50000)
			{
				tax=(salary*20)/100;
			}
			else if(salary>50000 && salary<=80000)
			{
				tax=(salary*24)/100;
			}
			else if(salary>80000 )
			{
				tax=(salary*28)/100;
			}
			
			return tax;
		}
		
		


		
	}

