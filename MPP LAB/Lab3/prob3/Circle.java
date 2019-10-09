package lesson3.labs.prob3;

public class Circle {
private double rad;
	
	Circle(double rad){
		this.rad = rad;
	}
	
	public double computeArea() {
		return 3.14 * rad * rad;
	}

}
