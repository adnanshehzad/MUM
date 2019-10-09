package Delimeters2a;

import java.util.Stack;

public class Program2a {
	public Stack<Character> stack; 
	
	public Program2a() {
		// TODO Auto-generated constructor stub
		stack=new Stack<Character>();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program2a prog=new Program2a(); //Object
		String str="((a + b[(x+y))] + 10)";
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(c=='(' || c=='[')
			{
				prog.stack.push(c);
			}
			else if(c==')' || c==']')
			{
				prog.stack.pop();
			}
			
		}
		if(prog.stack.isEmpty())
		{
			System.out.println("No Syntax Erro");
		}
		else
		{
			System.out.println("Syntax Error");
		}
		
	}

}
