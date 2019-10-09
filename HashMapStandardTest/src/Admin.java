
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		//implement
		HashMap<Key, Student> retHashMap=new HashMap<Key, Student>();
		for(Student std: students)
		{
			Key temp=new Key(std.getFirstName(), std.getLastName());
			retHashMap.put(temp, std);
		}
		return retHashMap;
	}
}
