import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CProgram2 {
	Queue<Character> queue1;
	Queue<Character> queue2;
	
	public CProgram2() {
		// TODO Auto-generated constructor stub
		queue1=new LinkedList<Character>();
		queue2=new LinkedList<Character>();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CProgram2 prog=new CProgram2();
		char result=0;
		System.out.print("Enter the String to read : ");
		Scanner sci=new Scanner(System.in);
		String inp=sci.nextLine();
		result=prog.ReadInputFromKeyboard(inp);
		System.out.println("Input \t \t Output");
		System.out.println(inp + "\t " + result);
	}
	
	public char ReadInputFromKeyboard(String input)
	{
		boolean isLeft=true;
		boolean isColonFound=false;
		if(input.equals(null) || input.length()<=0) 
		return 0;
		
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)!=':')
			{
				if(isLeft)  //Checking the Left Part
				{
					queue1.add(input.charAt(i));
				} 
				else // Adding in the Right part
				{
					queue2.add(input.charAt(i));
				}
			}
			else if(input.charAt(i)==':')
			{
				isLeft=false;  
				isColonFound=true;
			}
		}
		
		//System.out.println(queue1);
		//System.out.println(queue2);
		char result;
		if(isColonFound==false)
			return 'N';
		else
		 result = compareStringinQueue(queue1,queue2) ;
		return result;
		
	}

	public char compareStringinQueue(Queue<Character> queue1, Queue<Character> queue2) {
		// TODO Auto-generated method stub
		char retvalue = 0;
		if(queue1.size()>queue2.size())
		{
			retvalue='L';
		}
		else if(queue1.size()<queue2.size())
		{
			retvalue='R';
		}
		else if(queue1.size()==queue2.size()) 
		{
			while(!queue1.isEmpty())
			{
				char c1=queue1.remove();
				char c2=queue2.remove();
				if(c1!=c2)
				{
					retvalue='D';
					return retvalue;
				}
			}
			retvalue='S';
		}
		
		return retvalue;
	}

}
