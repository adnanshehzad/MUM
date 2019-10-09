

public class ArrayQueueImpl {

	private int[] arr = new int[10];
	private int front = -1;
	private int rear = 0;
	private int size=0;
	
	public int peek() throws QueueException{
		if(arr==null || front==-1)
			throw new QueueException();
		else
		return arr[front];
		//implement
	}
	
	public void enqueue(int obj){
		//implement
		
		if(size>=arr.length)
		{
			resizeArray();
		}
		
		{
			arr[rear]=obj;
			rear++;
			size++;
			if(front==-1)
				front=0;
		}
		
	}
	
	public int dequeue() throws QueueException{
		//return -1;
		//implement
		if(arr==null || size<1)
		{
			throw new QueueException();
		}
		else
		{
			int value=arr[front];
			front++;
			size--;
			return value;
		}
		
	}
	
	public boolean isEmpty(){	
		//implement
		if(size<1)
			return true;
		else
			return false;
	}
	
	public int size(){	
		//implement
		return size+1;
	}
	
	public void resizeArray()
	{
			int []temp=new int [10];
			System.arraycopy(arr, 0, temp, 0, arr.length);
			arr=new int[temp.length*2];
			System.arraycopy(temp, 0, arr, 0, temp.length);
	}
	
}
