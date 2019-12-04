package domain;

public class Address {

	private long id;
	private String street;
	private String city;
	private String zip;
	private String country;
	
	public Address() {
		
	}
	
	public Address(String street, String city, String zip, String country) {
		this.street = street;
		this.city = city;
		this.zip = zip;
		this.country = country;
	}
	

	public long getId() {
		return id;
	}

	
	public String getStreet() {
		return street;
	}

	
	public String getCity() {
		return city;
	}

	
	public String getZip() {
		return zip;
	}

	
	public String getCountry() {
		return country;
	}
	
	public void setId(long l) {
		id = l;
	}

	
	public void setStreet(String string) {
		street = string;
	}
	
	public void setCity(String string) {
		city = string;
	}

	
	public void setZip(String string) {
		zip = string;
	}

	
	public void setCountry(String string) {
		country = string;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", city=" + city + ", zip=" + zip + ", country=" + country
				+ "]";
	}
}

