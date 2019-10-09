import java.sql.Date;

public class DeptEmployee {
	private String name;
	private double salary;
	private Date hireDate;
	
	public DeptEmployee() {
		// TODO Auto-generated constructor stub
	}
	
	public DeptEmployee(String s, double sal, Date h)
	{
		name=s;
		salary=sal;
		hireDate=h;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setHireDate(Date d)
	{
		this.hireDate=d;
	}
	public String getName()
	{
		return name;
	}
	public Date getHireDate()
	{
		return hireDate;
	}
	
	public double computeSalary()
	{
		return salary;
	}
}
