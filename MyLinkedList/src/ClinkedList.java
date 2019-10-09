
import java.util.Currency;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class ClinkedList {

	private Node head;
	
	public ClinkedList() {
		// TODO Auto-generated constructor stub
		head=null;	
	}
	
	public void Add(char e)
	{
		Node temp=new Node(null,null,e);
		if(head==null)
		{
			head=temp;
		}
		else
		{
			Node last=head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=temp;
			temp.prev=last;
			
		}
	}
	public void addFirst(char c)
	{
		Node temp=new Node(null,null,c);
		temp.next=head;
		head.prev=temp;
		head=temp;
		
	}
	public void addLast(char c)
	{
		Node temp=new Node(null,null,c);
		Node last=head;
		while(last.next!=null)
		{
			last=last.next;
		}
		last.next=temp;
		temp.prev=last;
	}
	
	public void deleteFirst()
	{
		head=head.next;
		head.prev=head;
			
	}
	public void deleteLast()
	{
		Node curr=head;
		Node prev=null;
		while(curr.next!=null)
		{
			prev=curr;
			curr=curr.next;
		}
		prev.next=null;
		curr.prev=null;
	}

	public void printElements() {
		// TODO Auto-generated method stub
	Node current=head;
	while(current.next!=null)
	{
		System.out.println("The value of linked list is :" + (char)current.data);
		current=current.next;
	}
	System.out.println("The value of linked list is :" + (char)current.data);
		
	}
	
	
}
