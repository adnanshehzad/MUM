
public class DoublyLinkedDeleteFirst {
	
	Node header;

	public DoublyLinkedDeleteFirst() {
		header = new Node();
	}
	
	//removes the node at position 1 and returns
	//the string contained in that node
	public String deleteFirst() throws IllegalStateException{
		//implement
		if(isEmpty()) return null;
		String value=null;
		//Node temp=header.next;
		Node temp=header.next;
		Node temp1=header.next.next;
		Node temp2=header.next.next.next;
		if(temp.next==null )
		{
			throw new IllegalStateException();
		}
		value=temp1.value;
		temp.next=temp2;
		temp2.previous=temp;
		temp1=null;
		
		return value;
	}
	
	public boolean isEmpty() {
		//implement
		if(header.next==null)
			return true;
		else		
		return false;
	}

	// adds to the end of the list
	public void addLast(String item) {
		Node next = header;
		while (next.next != null) {
			next = next.next;
		}
		Node n = new Node();
		n.value = item;
		next.next = n;
		n.previous = next;

	}
	
	

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		toString(sb, header);
		return sb.toString();

	}

	private void toString(StringBuilder sb, Node n) {
		if (n == null)
			return;
		if (n.value != null)
			sb.append(" " + n.value);
		toString(sb, n.next);
	}

	class Node {
		String value;
		Node next;
		Node previous;

		public String toString() {
			return value == null ? "null" : value;
		}
	}

	public static void main(String[] args) {
		DoublyLinkedDeleteFirst list = new DoublyLinkedDeleteFirst();
		//try {
		list.addLast("Bob");
		list.addLast("Harry");
//		list.addLast("Steve1");
//		list.addLast("Steve2");
//		list.addLast("Steve3");
//		list.addLast("Steve4");
//		list.addLast("Steve5");
//		list.addLast("Steve6");
//		list.addLast("Steve7");
		
		//}
//		catch (IllegalStateException e) {
//			// TODO: handle exception
//			System.out.println("The exception is throws which is " + e.getMessage());
//		}
		try {
		String deleted = list.deleteFirst();
		System.out.println("This item was deleted: " + deleted);

		String deleted1 = list.deleteFirst();
		System.out.println("This item was deleted: " + deleted1);

		String deleted2 = list.deleteFirst();
		System.out.println("This item was deleted: " + deleted2);

		String deleted3 = list.deleteFirst();
		System.out.println("This item was deleted: " + deleted3);

		String deleted4 = list.deleteFirst();
		System.out.println("This item was deleted: " + deleted4);
		}
		catch (IllegalStateException e) {
			// TODO: handle exception
			System.out.println("The exception is throws which is " + e.getMessage());
		}
		System.out.println(list);

	}
}
