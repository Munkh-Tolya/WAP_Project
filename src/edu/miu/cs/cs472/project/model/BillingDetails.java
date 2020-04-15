package edu.miu.cs.cs472.project.model;

public class BillingDetails {
	private String street;
	private String zipcode;
	private String city;
	private String state;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String note;
	
	public BillingDetails(String fn, String ln, String str, String zip, String c, String stt, String e, String ph, String n) {
		this.firstName = fn;
		this.lastName = ln;
		this.street = str;
		this.zipcode = zip;
		this.city = c;
		this.state = stt;
		this.email = e;
		this.phone = ph;
		this.note = n;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
}
