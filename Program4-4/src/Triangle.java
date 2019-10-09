
public class Triangle {
	private double base;
	private double height;
	public Triangle() {
		// TODO Auto-generated constructor stub
	}
	
	public Triangle(double b, double h)
	{
		base=b;
		height=h;
	}
	
	public double getBase()
	{
		return base;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public double computeArea()
	{
		double area=0;
		area=0.5*base*height;
		return area;
	}

}
