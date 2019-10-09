import java.util.Scanner;

public class Program3 {

	public Program3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To Take Input From the user and find the Minimum Number from the array
	 int[] array=new int[] {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
	 int result=findMinimumNumber(array);
	 int avg=findAverageNumbers(array);
	 System.out.println("The Minimum value in the Array is: " + result);
	 System.out.println("The Average value of the Array is: " + avg);
	}
	
	public static int findMinimumNumber(int[] input)
	{
		int minimum=input[0];
		for(int i=0;i<input.length;i++)
		{
			if(minimum>input[i])
			{
				minimum=input[i];
			}
		}
		return minimum;
	}
	
	public static int findAverageNumbers(int[] input)
	{
		int average=0;
		int sum=0;
		for(int i=0;i<input.length;i++)
		{
			sum+=input[i];
		}
		average=sum/input.length;
		return average;
	}
	

}
