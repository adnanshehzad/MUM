
package MPPPretestPrep;

public class Banker {

	private static int Age;
	private String Name;
	private String Gender;
	
	
	public Banker(int age,String name, String gender) {
		// TODO Auto-generated constructor stub
		Age=age;
		Name=name;
		Gender=gender;
		
	}
	
	public Banker() {
		// TODO Auto-generated constructor stub
	}

	public void SetAge(int age)
	{
		Age=age;
	}
	public int Getage()
	{
		return Age;
	}
	
	public void SetName(String name)
	{
		Name=name;
	}
	public String Getname()
	{
		return Name;
	}
	public void Setgender(String gender)
	{
		Gender=gender;
	}
	public String GetGender()
	{
		return Gender;
	}
	
	public static int GetMoney()
	{
		return Age;
	}

}
