

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EmployeeAdmin {
	
	/**
		Returns a list of Employees whose social security number is on the input list socSecNums
		and whose salary is > 80000. The list must be ordered by social security number,
		from lowest to highest. To sort, you must use a Collections sorting method
		and you must define your own Comparator to be used to compare Employees by ssn. 
	*/
	public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {
		//IMPLEMENT
		List<Employee> retList=new ArrayList<Employee>();
	
		Set set = table.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Map.Entry<String, Employee> me = (Map.Entry<String, Employee>)it.next();
			if(socSecNums.contains(me.getKey()) && me.getValue().getSalary() > 80000) {
				retList.add(me.getValue());			}
		}
		for(Entry<String,Employee> em:table.entrySet())
		{
			if(socSecNums.contains(em.getKey()) && em.getValue().getSalary()>80000)
			{
				
			}
		}
		for(Employee emp:table.values())
		{
			if(socSecNums.contains(emp.getSsn()) && emp.getSalary()>80000)
			{
				retList.add(emp);
			}
		}
		//if(socSecNums.contains(table.))
		Collections.sort(retList, new SSCCOMPARATOR());
		return retList;
		
	}
	
}
