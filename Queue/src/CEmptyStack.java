import java.util.Stack;

public class CEmptyStack {

	Stack<Integer> stack1;
	Stack<Integer> stack2;
	
	public CEmptyStack() {
		// TODO Auto-generated constructor stub
		stack1=new Stack<Integer>();
		stack2=new Stack<Integer>();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CEmptyStack emp=new CEmptyStack();
		emp.stack1.push(1);
		emp.stack1.push(2);
		emp.stack1.push(3);
		emp.stack1.push(4);
		emp.stack1.push(5);
		
		
		emp.stack2.push(6);
		emp.stack2.push(7);
		emp.stack2.push(8);
		emp.stack2.push(9);
		emp.stack2.push(10);
		//Stack<Integer> result=new Stack<Integer>();
		emp.stack2=emp.emptyStackOneonStackTwo(emp.stack1,emp.stack2);
		//System.out.println(emp.stack1);
		System.out.println(emp.stack2);
		
		
	}

	private Stack<Integer> emptyStackOneonStackTwo(Stack<Integer> source,Stack<Integer> destination) {
		// TODO Auto-generated method stub
		
		Stack<Integer> tempstack=new Stack<Integer>();
		while(!source.isEmpty())
		{
			tempstack.push(source.pop());
		}
		while(!tempstack.isEmpty())
		{
			destination.push(tempstack.pop());
		}
		
		return destination;
	}

	
}
