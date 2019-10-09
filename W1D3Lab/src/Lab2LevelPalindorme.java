import java.util.Scanner;

public class Lab2LevelPalindorme {

	public Lab2LevelPalindorme() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Lab 2 Level Palindrome NUmber checking in a sentence
	System.out.print("Enter the String to Check Palindrome: ");
	Scanner sci=new Scanner(System.in);
	StringBuilder input=new StringBuilder();
	input.append(sci.nextLine());
	int result=checkPalindromSentence(input);
	}
	
	public static int checkPalindromSentence(StringBuilder s)
	{
		//char[] newstr= 
		for(int i=0;i<s.length();i++)
		{
			if(Character.isLowerCase(s.charAt(i)))
			{
				char c=Character.toUpperCase(s.charAt(i));
				s.setCharAt(i, c);
			}		
		}
		
		System.out.println("The New UpperCase string is: " +s);
		
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isLetter(c)==false)
			{
				s.deleteCharAt(i);
				System.out.println("Deleted Character is: " +s);
			}
		}
		System.out.println("The new String withoutSpaces and Punctuation mark is : " + s);
		return 1;
	}

}
