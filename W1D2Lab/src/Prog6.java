import java.util.Arrays;
import java.util.LinkedHashSet;

public class Prog6 {

	public Prog6() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<args.length;i++)
		{
			System.out.println("The value of String args are:" + args[i]);
		}
		//Converting array to list and then adding all elements is Linkedhashset.It will automatically removes
		// all the duplicates from the HashSet
		LinkedHashSet<String> linkhash=new LinkedHashSet<String>(Arrays.asList(args));
		
		//Create array from HashSet
		String[] myarray=linkhash.toArray(new String[linkhash.size()]);
		
		System.out.println("Array after removing duplicates is :" + Arrays.toString(myarray));
		
	}

}
