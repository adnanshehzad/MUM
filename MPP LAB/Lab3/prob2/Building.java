package lesson3.labs.prob2;

import java.util.LinkedList;
import java.util.List;

public class Building {
	private List<Apartment> appartment;
	private double maintCost;
	public List<Apartment> getAppartment() {
		return appartment;
	}
	public void setAppartment(List<Apartment> appartment) {
		this.appartment = appartment;
	}
	public double getMaintCost() {
		return maintCost;
	}
	public void setMaintCost(double maintCost) {
		this.maintCost = maintCost;
	}
	public Building(List<Apartment> appartment, double maintCost) throws Exception{
		//super();
		//if(this.appartment.isEmpty())  throw new NullPointerException("Apartment List is Empty.");
		this.appartment = appartment;
		this.maintCost = maintCost;
	}
	
	public double getRentProfit() {
		double result = 0;
		
		for(Apartment a : this.appartment) {
			result += a.getRent();
		}
		
		return result - this.maintCost;
	}
	
	

}
