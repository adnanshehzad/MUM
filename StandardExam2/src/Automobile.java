//package prob2;

public class Automobile extends Vehicle {
	private String ownerName;
	private String license;
	private int milesUsedToday;
	public Automobile(String owner, String license) {
		this.ownerName = owner;
		this .license = license;
	}
	public void setMilesUsedToday(int numMiles) {
		milesUsedToday = numMiles;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	public int getMilesUsedToday() {
		return milesUsedToday;
	}
	
}
