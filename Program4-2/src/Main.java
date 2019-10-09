import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	static EMPLOYEE[] emps=null;
	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		emps = new EMPLOYEE[3];
		emps[0] = new EMPLOYEE("Jim Daley", 2000, 9, 4);
		emps[1] = new EMPLOYEE("Bob Reuben", 1998, 1, 5);
		emps[2] = new EMPLOYEE("Susan Randolph", 1997, 2,13);
		
		emps[0].createNewChecking(10500);
		emps[0].createNewSavings(1000);
		emps[0].createNewRetirement(9300);
		emps[1].createNewChecking(34000);
		emps[1].createNewSavings(27000);
		//emps[1].createNewSavings(17000);
		emps[2].createNewChecking(10038);
		emps[2].createNewSavings(12600);
		emps[2].createNewRetirement(9000);	
		
//		for phase I – console output
		Scanner sc = new Scanner(System.in);
		System.out.print("See a report of all account balances? (y/n) ");
		String answer = sc.next();
		if(answer.equalsIgnoreCase("y")){
			for(int i=0;i<emps.length;i++)
			{
				String result=null;
				 result=emps[i].getFormattedAcctInfo();
				System.out.println(result);
			}
			
		}
		else {
			//do nothing..the application ends here
		}				

	}

}
