import java.util.Comparator;

public class SSCCOMPARATOR implements Comparator<Employee>{

	public SSCCOMPARATOR()  {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getSsn().compareTo(o2.getSsn());
	}

}
