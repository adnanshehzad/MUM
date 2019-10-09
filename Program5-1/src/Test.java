import java.util.Scanner;


public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Secretary s1=new Secretary(200);
	Secretary s2=new Secretary(200);
	Professor p1=new Professor(10);
	Professor p2=new Professor(10);
	Professor p3=new Professor(10);
	
	DeptEmployee[] deptEmployee=new DeptEmployee[5];
	
	deptEmployee[0]=s1;
	deptEmployee[1]=s2;
	deptEmployee[2]=p1;
	deptEmployee[3]=p2;
	deptEmployee[4]=p3;
	deptEmployee[0].setName("Adnan");
	
	System.out.print("Do you like to see the sum of all salaries: ");
	Scanner sci=new Scanner(System.in);
	String str=sci.nextLine();
	double sum=0;
	if(str.equals("y"))
	{
		
		for (DeptEmployee emp:deptEmployee)
		{
			sum+=emp.computeSalary();
		}
		System.out.println("The value of all sum is: " +sum );
	}
	else
	{
		System.out.println("Invalid Parameter");
	}
	
	}
	

}
