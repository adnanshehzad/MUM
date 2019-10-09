package lesson3.labs.prob3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle cir = new Circle(2);
		Cylinder cylynder = new Cylinder(cir, 2);
		System.out.println("Circle area is: " + cir.computeArea());
		System.out.println("Cylinder Volume is: " + cylynder.cumputeVolume());
	}
}
