//package prob2;

public class Bicycle extends Vehicle{
	private String owner;
	private String make;
	private int milesUsedToday;
	public Bicycle(String ownerName, String make) {
		this.owner = ownerName;
		this.make = make;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getMilesUsedToday() {
		return milesUsedToday;
	}
	public void setMilesUsedToday(int milesUsedToday) {
		this.milesUsedToday = milesUsedToday;
	}
}
