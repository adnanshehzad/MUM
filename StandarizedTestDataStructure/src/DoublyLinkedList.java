
public class DoublyLinkedList {
	
		Node header;
		DoublyLinkedList(){
			header = new Node();
		}
		//adds to the end of the list
		public void addLast(String item){
			//implement
			
			if(header.next==null)
			{
				Node temp=new Node(null,null,item);
				header.next=temp;
				temp.previous=header;
			}
			else
			{
				Node curr=new Node(null,null,item);
				Node last=header;
				while(last.next!=null)
				{
					last=last.next;
				}
				last.next=curr;
				curr.previous=last;
				
			}
			
		}
		@Override
		public String toString() {
			
			StringBuilder sb = new StringBuilder();
			toString(sb, header);
			return sb.toString();
			
		}
		private void toString(StringBuilder sb, Node n) {
			if(n==null) return;
			if(n.value != null) sb.append(" " + n.value);
			toString(sb, n.next);
		}
		
		class Node {
			String value;
			Node next;
			Node previous;
			
			public String toString() {
				return value == null ? "null" : value;
			}
			Node()
			{
				value=null;
				next=null;
				previous=null;
			}
			Node(Node next,Node prev,String value)
			{
				this.next=next;
				this.previous=prev;
				this.value=value;
			}
		}
	
		public static void main(String[] args){
			DoublyLinkedList list = new DoublyLinkedList();
			list.addLast("Bob");
			list.addLast("Harry");
			list.addLast("Steve");
			list.addLast("carol");
			list.addLast("inn");
			list.addLast("dda");
			list.addLast("fff");
			list.addLast("fff");
			list.addLast("cacccrol");
			list.addLast("sds");
			list.addLast("sdsd");
			System.out.println(list);
		}
}
