package MPPPretestPrep;
import java.util.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Arrays;

public class INIT {

	public static void main(String[] args) {
	
		List<Shape> shape=new ArrayList<Shape>();
		//List<Shape> shape1=new ArrayList<Shape>();
		int [] array=new int[] {1,4,1,5,10,3,4};
		Arrays.sort(array);
		shape.add(new Circle());
		shape.add(new Rectangle());
		StringBuilder strbuild=new StringBuilder();
		for(Shape sp: shape)
		{
			strbuild.append(sp.Display());
			
			System.out.println("Average Area for " + sp.getClass() + "is" + sp.ComputeArea());
			System.out.println("The Final Concatenated string is :" + strbuild);
		}
		for(int i=0;i<array.length;i++)
		{
			System.out.println("The value of sorted array is: " + array[i] + "\n");
		}
		
	}
}
