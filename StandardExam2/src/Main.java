//package prob2;

import java.time.LocalDate;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Bicycle bike1 = new Bicycle("Joe", "Schwinn");
		bike1.setMilesUsedToday(11);
		Automobile auto1 = new Automobile("Tom", "Ford");
		auto1.setMilesUsedToday(25);
		Boat boat1 = new Boat("Jim", LocalDate.of(12,12,12));
		boat1.setMilesUsedToday(12);
		Automobile auto2 = new Automobile("Harry", "Mazda");
		auto2.setMilesUsedToday(15);
		Bicycle bike2 = new Bicycle("Rich", "Schwinn");
		bike2.setMilesUsedToday(8);
		Automobile auto3 = new Automobile("Susan", "Toyota");
		auto3.setMilesUsedToday(18);
		Boat boat2 = new Boat("Anne", LocalDate.of(11,11,11));
		boat2.setMilesUsedToday(17);
		Object[] vehicles = {bike1, auto1, boat1, auto2,bike2,
				auto3, boat2};
		List<Vehicle> vehicleList = MilesCounter.convertArray(vehicles);
		int totalMiles = MilesCounter.computeTotalMiles(vehicleList);
		
		System.out.println("The total number of miles for all vehicles are: "+ totalMiles);

	}

}
