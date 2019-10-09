package prob1;

import java.util.ArrayList;
import java.util.List;

public class TestData {
	// DO NOT MODIFY
	@SuppressWarnings("serial")
	public static List<Employee> originalList = new ArrayList<Employee>() {
		{
			add(new Employee("Richard", 55000));
			add(new Employee("Richard", 55000));
			add(new Employee("John", 30000));
			add(new Employee("Steve", 30000));
			add(new Employee("Zeke", 50000));
			add(new Employee("Reggie", 50000));
			add(new Employee("Steve", 30000));
			add(new Employee("John", 70000));
			add(new Employee("Harold", 55000));
			add(new Employee("Richard", 55000));
			add(new Employee("Richard", 55000));
			add(new Employee("Richard", 60000));
			add(new Employee("Dennis", 80000));
			add(new Employee("Adam", 80000));
			add(new Employee("John", 70000));
			add(new Employee("Charles", 25000));
			add(new Employee("Bill", 60000));
			add(new Employee("Bob", 60000));
			add(new Employee("Bill", 70000));
			add(new Employee("Bob", 60000));
		}
	};

	// This is the list of all distinct Employees contained in originalList (defined above) 
	// DO NOT MODIFY
	@SuppressWarnings("serial")
	public static List<Employee> dupsRemoved = new ArrayList<Employee>() {
		{
			add(new Employee("Richard", 55000));
			add(new Employee("John", 30000));
			add(new Employee("Steve", 30000));
			add(new Employee("Zeke", 50000));
			add(new Employee("Reggie", 50000));
			add(new Employee("John", 70000));
			add(new Employee("Harold", 55000));
			add(new Employee("Richard", 60000));
			add(new Employee("Dennis", 80000));
			add(new Employee("Adam", 80000));
			add(new Employee("Charles", 25000));
			add(new Employee("Bill", 60000));
			add(new Employee("Bill", 70000));
			add(new Employee("Bob", 60000));
		}
	};
}
