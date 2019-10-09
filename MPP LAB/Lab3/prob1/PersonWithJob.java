package lesson3.labs.prob1;

public class PersonWithJob {
	
	private double salary;
	public Person per;
	
	public double getSalary() {
		return salary;
	}
	
	public Person getPerson(){
		return per;
	}
	
	PersonWithJob(String name, double s) {
		//super(n);
		per = new Person(name);
		salary =s;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonWithJob other = (PersonWithJob) obj;
		if (per == null) {
			if (other.per != null)
				return false;
		} else if (!per.equals(other.per))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}
	
	
	public static void main(String[] args) {
		Person p1 = new Person("Joe");
		PersonWithJob p2 = new PersonWithJob("Joe", 30000);
		
		//Since p1 is not instance of p2 and p2 is not an instance of p2, they both are not equal to each other.
		
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));
	}

	

}

