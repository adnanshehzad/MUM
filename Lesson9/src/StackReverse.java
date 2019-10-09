
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;


public class StackReverse {

	public Stack<Integer> stk=new Stack<Integer>();
	
	public StackReverse() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value=0;
		System.out.println("Enter the Integers to reverse");
		Scanner sci=new Scanner(System.in);
		StackReverse rev=new StackReverse();
		
		while(true)
		{
		 value=sci.nextInt();
		 if(value==-1)
		 {
			 rev.printReverseElements(rev.stk);
		 }
		 else
		 rev.stk.push(value);
		}
	}
	
	public void printReverseElements(Stack<Integer> rev)
	{
		Iterator<Integer> iterator=rev.iterator();
		while(iterator.hasNext())
		{
			System.out.println("Reverse elements are: "+ rev.pop());
		}
		System.out.println("and");
	}

}
