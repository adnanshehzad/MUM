package lesson3.labs.prob4;

public class Address {
	private String state;
	private String city;
	private String street;
	private String number;

	public Address(String state, String city, String street, String number) {
		super();
		this.state = state;
		this.city = city;
		this.street = street;
		this.number = number;
	}

	public String getState() {
		return this.state;
	}

	public String getCity() {
		return city;
	}



	public String getStreet() {
		return street;
	}



	public String getNumber() {
		return number;
	}

}
