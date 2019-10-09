import java.util.Scanner;

public class StarProblems {

	public StarProblems() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the Number of Lines you want to print star on it : ");
		Scanner sci=new Scanner(System.in);
		int input=sci.nextInt();
		printStraightStar(input);
		printOppositeStar(input);
		
	}
	
	public static void printStraightStar(int input)
	{
		for(int i=0;i<input;i++)
		{
			for(int j=0;j<input;j++)
			{
				if(i==j || j==0 || i==(input-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}
	//Another Star Pattern
	public static void printOppositeStar(int input)
	{
		for(int i=0;i<input;i++)
		{
			for(int j=0;j<input;j++)
			{
				if(i==(input-1) || j==(input-1) || (i+j==(input-1)))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}

}
