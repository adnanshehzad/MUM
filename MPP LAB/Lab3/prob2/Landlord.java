package lesson3.labs.prob2;

import java.util.List;

public class Landlord  {
	List<Building> building;
	public Landlord(List<Building> building) throws Exception{
		//super();
		//if(building.isEmpty()) throw new NullPointerException("Building List is empty");
		this.building = building;
	}
	public double getRentProfit() {
		double returnvalue = 0;
		
		for(Building b : this.building) {
			returnvalue += b.getRentProfit();
		}
		return returnvalue;
	}

	
	

}
