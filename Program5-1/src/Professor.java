
public class Professor extends DeptEmployee{
	private int noofpublications;
	public Professor() {
		// TODO Auto-generated constructor stub
	}
	
	public Professor(int noofpub)
	{
		noofpublications=noofpub;
	}
	
	public void setNoOfPublications(int no) {
		noofpublications=no;
	}
	
	public int getNoOfPublications()
	{
		return noofpublications;
	}

}
