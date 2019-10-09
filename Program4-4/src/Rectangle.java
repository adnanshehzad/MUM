
public class Rectangle {
	private double width;
	private double height;
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	
	public Rectangle(double w, double h)
	{
		width=w;
		height=h;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public double computeArea()
	{
		double area=0;
		area=width*height;
		return area;
	}
}
