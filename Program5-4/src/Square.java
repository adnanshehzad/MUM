
public class Square extends ClosedCurve implements Polygon {
	double side;
	public Square(Double side){
		this(side.doubleValue());
	}
	public Square(double side) {
		this.side = side;
	}
	double computeArea() {
		return(side*side);
	}
	@Override
	public int getNumberOfSides() {
		// TODO Auto-generated method stub
		return 4;
	}
	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return side*4;
	}
}
