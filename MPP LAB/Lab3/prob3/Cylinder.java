package lesson3.labs.prob3;

public class Cylinder {
	private Circle base;
	private double height;
	
	Cylinder(Circle base, double height){
		if(base == null) throw new NullPointerException("Exception: Base shoul not be null.");
		this.base = base;
		this.height = height;
	}
	
	public double cumputeVolume() {
		return this.base.computeArea() * this.height;
	}

}
