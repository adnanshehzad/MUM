
public class Node {
	int data;
	Node next;
	Node prev;
	public Node() {
		// TODO Auto-generated constructor stub
	}
	public Node(int data)
	{
		this.data=data;
	}
	 public Node(Node next,Node prev,int data)
	{
		this.next=next;
		this.prev=prev;
		this.data=data;
	}
}
