//package prob2;

import java.time.LocalDate;

public class Boat extends Vehicle{
	private String owner;
	private LocalDate lastServiced;
	private int milesUsedToday;
	public Boat(String ownerName, LocalDate lastServiced) {
		this.owner = ownerName;
		this.lastServiced = lastServiced;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public LocalDate getLastServiced() {
		return lastServiced;
	}
	public void setLastServiced(LocalDate lastServiced) {
		this.lastServiced = lastServiced;
	}
	public int getMilesUsedToday() {
		return milesUsedToday;
	}
	public void setMilesUsedToday(int milesUsedToday) {
		this.milesUsedToday = milesUsedToday;
	}
}
