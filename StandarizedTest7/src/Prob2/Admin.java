package Prob2;

import java.util.ArrayList;
import java.util.List;

public class Admin {
	public static List<Student> convertArray(Object[] studentArray) {
		/* implement */
		List<Student> stud=new ArrayList<Student>();
		for(Object obj:studentArray)
		{
			stud.add((Student)obj);
		}
		return stud;
	}
	
	
	public static double computeAverageGpa(List<Student> studentList) {
		/*implement */
		double avggpa=0;
		for(Student std:studentList)
		{
			avggpa+=std.computeGpa();
		}
		return avggpa/studentList.size();
	}
}
