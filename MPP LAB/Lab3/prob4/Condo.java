package lesson3.labs.prob4;

public class Condo extends Property {

	private int numberOfFloors;
	
	public Condo(Address address, int numberOfFloors) {
		super(address);
		this.numberOfFloors = numberOfFloors;
	}

	public double computeRent(){
		return 500 * numberOfFloors;
	}
}
