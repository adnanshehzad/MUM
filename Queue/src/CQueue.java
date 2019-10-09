import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class CQueue {

	Queue<Integer> queue=new LinkedList<Integer>();
	Stack<Integer> stack=new Stack<Integer>();
	
	public CQueue() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CQueue cque=new CQueue();
		cque.queue.add(1);
		cque.queue.add(2);
		cque.queue.add(3);
		cque.queue.add(4);
		cque.queue.add(5);
		//cque.queue.remove();
		
		cque.stack.push(6);
		cque.stack.push(7);
		cque.stack.push(8);
		cque.stack.push(9);
		cque.stack.push(10);
		//cque.stack.pop();
		
		cque.MoveFromStackToQueue(cque.stack);
		cque.MoveFromQueueToStack(cque.queue);
		System.out.println("The Queues Values Are: " + cque.queue);
		System.out.println("The stack values are " + cque.stack);
	}

	private void MoveFromQueueToStack(Queue<Integer> queue2) {
		// TODO Auto-generated method stub
		//Iterator<Integer> iterator=queue2.iterator();
		while(!queue2.isEmpty())
		{
			//Integer add=iterator.next();
			stack.push(queue2.remove());

		}	
	}

	public void MoveFromStackToQueue(Stack<Integer> list)
	{
		
		//Iterator<Integer> iterator=list.iterator();
		while(!stack.isEmpty())
		{
			//Integer add=iterator.next();
			queue.add(stack.pop());
		}
	}
}
