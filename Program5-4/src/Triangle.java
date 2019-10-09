
// IGNORE many of the details in this file!

import java.util.Arrays;

public class Triangle extends ClosedCurve implements Polygon{
	double base;
	double height;
	double side1;
	double side2;
	double side3;
	

        
       	public Triangle(Double s1, Double s2, Double s3){
		this(s1.doubleValue(),s2.doubleValue(),s3.doubleValue());
	}
	public Triangle(double side1, double side2, double side3)  {
		double[] arr = sort(side1,side2,side3);		
		double x = arr[0];
		double y = arr[1];
		double z = arr[2];
		if(x + y < z) {
			System.out.println("Illegal sizes for a triangle: "+side1+", "+side2+", "+side3);
			System.out.println("Using default sizes.");
			setValues(DEFAULT_SIDE,DEFAULT_SIDE,DEFAULT_SIDE);
			computeBaseAndHeight(DEFAULT_SIDE,DEFAULT_SIDE,DEFAULT_SIDE);
		}
		else {	
			setValues(x,y,z);
			computeBaseAndHeight(x,y,z);
		}
	}
	public void setValues(double x, double y, double z){
		side1 = x;
		side2 = y;
		side3 = z;
	}
	private void computeBaseAndHeight(double x, double y, double z){
		double u = (y*y - x*x + z*z)/(2*z);
		double h = Math.sqrt(y*y - u*u);
		base = z;
		height = h;		
	}
	double computeArea() {
		return (0.5 * base * height);
	}
	private double[] sort(double a, double b, double c){
		double[] retVal = new double[3];
		double[] others = new double[2];
		double min = a;
		others = new double[]{b,c};
		
		
		if(b < min) {
			min = b;
			others = new double[]{a,c};
		}
		
		if(c < min) {
			min = c;
			others = new double[]{a,b};
		}
		retVal[0]= min;
		if(others[0]> others[1])
			others= new double[]{others[1],others[0]};
		
		retVal[1]=others[0];
		retVal[2]=others[1];
		//System.out.println("Sorted: "+Arrays.toString(retVal));
		return retVal;
	}

	public static void main(String[] args){
		
			Triangle t = new Triangle(1.41421, 1.41421, 2);
			System.out.println("Area: "+t.computeArea());
		
			
	}
	
	private final double DEFAULT_SIDE = 5.0;



	@Override
	public int getNumberOfSides() {
		// TODO Auto-generated method stub
		return 3;
	}
	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return side1+side2+side3;
	}

}
