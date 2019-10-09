package lesson3.labs.prob2;

import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Apartment apart1 = new Apartment(1, 450.0);
		Apartment apart2 = new Apartment(2, 500.0);
		List<Apartment> L1apart = new LinkedList<Apartment>();
		L1apart.add(apart1);
		L1apart.add(apart2);
		
		Apartment apart21 = new Apartment(1, 450.0);
		Apartment apart22 = new Apartment(2, 500);
		List<Apartment> L2apart = new LinkedList<>();
		L2apart.add(apart21);
		L2apart.add(apart22);
		
		Building b1 = new Building( L1apart, 200);
		Building b2 = new Building( L2apart, 200);
		
		List<Building> buildings = new LinkedList<>();
		buildings.add(b1);
		buildings.add(b2);
		Landlord landLord = new Landlord(buildings);
		
		System.out.println("Profits: " + landLord.getRentProfit());
		
	}

}
