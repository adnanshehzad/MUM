import java.math.*;

public class Circle {

	private  double radius;
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	public Circle(int r)
	{
		radius=r;
	}
	
	public double getRadius()
	{
		return radius;
	}
	 public double computeArea()
	 {
		 double radius=(Math.PI)* (Math.pow(this.radius, 2));
		 return radius;
	 }

}
