import java.util.Scanner;

public class Program2 {

	public Program2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Section a of the Program
		System.out.print("Enter the Input here: ");
		Scanner sci=new Scanner(System.in);
		StringBuilder strbuild= new StringBuilder();
		strbuild.append(sci.nextLine());
		System.out.println("The value from user is: " + strbuild);
		// After appending the value "Bye " to string builder it becomes
		System.out.println("The value after appending becomes: " + strbuild.append("Bye"));
		
		////Section 2 of the Programs
		String result=checkString_Upper_LowerCase(strbuild);
		
		System.out.println("The Result is : " + result);
	}
	
	public static String checkString_Upper_LowerCase(StringBuilder str)
	{
		//Character chr=null;
		String result=null;
		for(int i=0;i<str.length();i++)
		{
			if(Character.isUpperCase(str.charAt(i)))
			{
				char ch=Character.toLowerCase(str.charAt(i));
				str.setCharAt(i, ch);
			}
			else if(Character.isLowerCase(str.charAt(i)))
			{
				char ch=Character.toUpperCase(str.charAt(i));
				str.setCharAt(i, ch);
			}
			else
			{
				System.out.println("The value in the index " + i + "is not a character");
			}
		}
		result=str.toString();
		
		return result;
	}

}
