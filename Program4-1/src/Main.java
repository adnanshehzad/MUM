
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	EMPLOYEE employee=new EMPLOYEE("adnan" ,80000,2020,04,15);
	System.out.println(employee.getHireDay());
	ACCOUNT[] account=new ACCOUNT[3];
	account[0]=new ACCOUNT(employee,AccountType.CHECKING,300);
	account[1]=new ACCOUNT(employee,AccountType.SAVINGS,300);
	account[2]=new ACCOUNT(employee,AccountType.RETIREMENT,300);
	
	for(ACCOUNT ac:account)
	{
		System.out.println(ac.toString());
	}
	}

}
