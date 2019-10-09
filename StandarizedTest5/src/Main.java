

public class Main {

	public static void main(String[] args) {
		ArrayQueueImpl q = new ArrayQueueImpl();
		try {
			q.peek();
		} catch (QueueException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for(int i = 0; i < 15; i ++)
			q.enqueue(i);
		for(int i = 0; i < 15; i ++)
		{
		try {
		int value=q.dequeue();
		System.out.println("Value of DeQueue is : " + value + "value of size is: " +q.size() + q.isEmpty());
		System.out.println(q.isEmpty());
			}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage() + "Error");
		}

		}

	}
}