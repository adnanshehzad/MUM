import java.util.Scanner;

public class Program1 {

	public Program1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the Input here: ");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		//Writing a function to check that its Palindrome or not
		int result=CheckPalindrome(input);
		if(result==0)
			System.out.println("Number is not a Palindrome");
		else
			System.out.println("Number is a Palindrome");
	}
	
	public static int CheckPalindrome(String str)
	{
		char[] newarr=new char[str.length()];
		for(int i=str.length()-1;i>=0;i--)  //Oppositing the array and sending the values in next array
		{
			newarr[(str.length()-1)-i]=str.charAt(i);
		}
		for(int i=0;i<newarr.length;i++) //Checking either the both arrays are matching with each other.
		{
			if(!(str.charAt(i)==newarr[i]))
			{
				return 0;
			}
		}
		return 1;
		
	}

}
