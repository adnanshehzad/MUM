import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;



public class MyHashTable {

	private static final int INITIAL_SIZE;
	static {
		INITIAL_SIZE=19;
	}
	private int tableSize;
	private LinkedList[] table; 
	
	public MyHashTable(){
		this(INITIAL_SIZE);
	}
	public MyHashTable(int tableSize) {
		this.tableSize = tableSize;
		table = new LinkedList[tableSize];
	}      // an array of LinkedList objects.
	public void put(Object key, Object value){
		//disallow null keys
		if(key==null) return;

		//get the "big" integer corresponding to the object
		//assumes key is not null
		int hashcode = key.hashCode();
		
		//compress down to a table slot
		int hash = Math.abs(hashM(hashcode));
		
		//put the value and the key into an Entry object
		//which will be placed in the table in the
		//slot ( namely, hash)



		//allows a null value
		Entry e = new Entry(key,value);
		
		// now place it in the table
		if(table[hash] == null){
			table[hash] = new LinkedList();
		}
		//this allows duplicate keys
		table[hash].add(e);
	}
 
	public Object get(Object key){
		//null key not allowed
		if(key==null) return null;
		//get the "big" integer corresponding to the object
		int hashcode = key.hashCode();
		
		//compress down to a table slot
		int hash = hashM(hashcode);
		
		//now look for the desired Entry
		Entry e = null;


    //First we should make sure that table[hash]
    //is Not null.  If it is null, then the 
    //Entry is Not there.      (JL 11-2009).

		Iterator it = table[hash].iterator();
		while(it.hasNext()){
			e = (Entry)it.next();
			if(e.key.equals(key)) {
				return e.value;
			}
		}
		return null; // Not found. 
		 
	}
	
 
public String toString(){
		String n = System.getProperty("line.separator");//a new line
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < table.length;++i){
			if(table[i] != null){
				Iterator it = table[i].iterator();//For the
                           //LinkedList at table[i]

				Entry next = null;
				while(it.hasNext()){
					next = (Entry)it.next();
					sb.append(next);
				}
			}
		}
		return sb.toString();
	}


//In the java file this method might be called hash
	private int hashM(int bigNum) {
		return bigNum % tableSize;
	}
	
 
private class Entry{
		private Object key;
		private Object value;
		Entry(Object key, Object value){
			this.key = key;
			this.value = value;
		}
		public String toString(){
			return key.toString()+"->"+value.toString();
		}
		
	}	

public int countNumberofElementsInHashTable()
{
	int count=0;
	if(table==null) return 0;
	else
	{
		for(int i=0;i<tableSize;i++)
		{
			if(table[i]!=null)
			{
				count++;
			}
		}
	}
	return count;
}

public int countLongestLinkedList()
{
	Entry ent=null;
	int Max=0;
	if(table==null) return 0;
	for(int i=0;i<table.length;i++)
	{
		if(table[i]!=null)
		{
			int count=0;
			Iterator iterate=table[i].iterator();
			while(iterate.hasNext())
			{
				ent=(Entry) iterate.next();
				count++;
			}
			if(Max ==0)
				Max=count;
			else
			{
				if(Max <count)
				{
					Max=count;
				}
			}
		}
	}
	
	return Max;
}

public int CountEmptyCells()
{
	int count=0;
	for(int i=0;i<table.length;i++)
	{
		if(table[i]==null)
		{
			count++;
		}
	}
	return count;
}


	public static void main(String[] args) {

		MyHashTable htable=new MyHashTable();
		htable.put("Adnan", "6416567861");
		htable.put("Adnan", "6416567830");
		htable.put("Adnan", "6416567844");
		htable.put("Dani", "6416567854");
		htable.put("Edgar", "6416567863");
		htable.put("Yousef", "6416567864");
		htable.put("Shine", "6416567865");
		htable.put("Haithm", "6416567866");
		htable.put("Sibtain", "6416567867");
//				
		//System.out.println("The values are "+  htable.get("Adnan"));
		System.out.println("The Number of elements in Hash tablea are: " + htable.countNumberofElementsInHashTable());
		System.out.println("The Number of elements in longest LinkedList are: " + htable.countLongestLinkedList());
		System.out.println("The Number of empty cells in Hash Table are : " + htable.CountEmptyCells());
		
		System.out.print("Enter the operation");
		Scanner sci=new Scanner(System.in);
		char input=sci.nextLine().charAt(0);
		
		while (input!='q')
		{
			System.out.print("Enter the Name to search");
			String in=sci.nextLine();
			
			System.out.println("The Phone Number is: " + htable.get(in) );
		}
	}

}
