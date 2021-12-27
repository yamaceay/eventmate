public class Address {

	private String street;

	private int apartmentNo;

	private int zipCode;

	private String city;

	private String land;

	private String fullAddress;

	private int addressId;

	public Address(String street, int apartmentNo, int zipCode, String city, String land, String fullAddress) {
		this.street = street;
		this.apartmentNo = apartmentNo;
		this.zipCode = zipCode;
		this.city = city;
		this.land = land;
		this.fullAddress = fullAddress;
		this.addressId = hashCode();
	}
	
	public Address() { }

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getApartmentNo() {
		return apartmentNo;
	}

	public void setApartmentNo(int apartmentNo) {
		this.apartmentNo = apartmentNo;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLand() {
		return land;
	}

	public void setLand(String land) {
		this.land = land;
	}

	public String getFullAddress() {
		return fullAddress;
	}

	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}

	public int getAddressId() {
		return addressId;
	}
}
