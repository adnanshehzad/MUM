
public class Rectangle extends ClosedCurve implements Polygon{
	private double width;
	private double length;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	
	public Rectangle(double w,double h) {
		width=w;
		length=h;
	}

	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		return (length*width);
		}

	@Override
	public int getNumberOfSides() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return (width*2)+(length*2);
	}

}
