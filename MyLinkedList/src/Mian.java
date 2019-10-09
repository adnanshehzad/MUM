
 class Mian {

	public Mian() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClinkedList list=new ClinkedList();
		list.Add('A');
		list.Add('D');
		list.Add('N');
		list.Add('A');
		list.Add('N');
		list.addFirst('M');
		list.addLast('S');
		list.deleteFirst();
		list.deleteLast();
		//list.addFirst('e');		
		//list.removeFirst();
		//list.addLast('D');
		//list.removeLast();
		//list.removeLast();
		list.printElements();
		
	}

}
