
public class Rectangle extends ClosedCurve{
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

}
