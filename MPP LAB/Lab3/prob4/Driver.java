package lesson3.labs.prob4;

public class Driver {

	public static void main(String[] args) {

		Property[] objects = { new House(new Address("DXM","Newyork", "NewYork LIne 2", "32A"), 9000), new Condo(new Address("DXM","Newyork", "NewYork LIne 2", "23"), 2), new Trailer(new Address("DXM","Newyork", "NewYork LIne 2", "37")) };
		double totalRent = Admin.computeTotalRent(objects);
		System.out.println(totalRent);
		
		// List all properties
		for(Property p : Admin.getPropertysByCity(objects, "Newyork")) {
			Address address = p.getAddress();
			System.out.println("Property: " + address.getStreet() + ", " + address.getNumber() );
		}
	}
}
