package phmr.elements;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="addr", propOrder={"streetAddressLine", "city", "state", "postalCode", "country"})
public class AddressSet {
	
	private String streetAddressLine;
	private String city;
	private String state;
	private String postalCode;
	private String country;
	
	@XmlElement(name="streetAddressLine")
	public String getStreetAddressLine() {
		return streetAddressLine;
	}

	public void setStreetAddressLine(String streetAddressLine) {
		this.streetAddressLine = streetAddressLine;
	}

	@XmlElement
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@XmlElement
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@XmlElement
	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	@XmlElement
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public AddressSet(){
		streetAddressLine = "123 Home Street";
		city = "Ann Arbor";
		state = "MI";
		postalCode="99999";
		country="USA";
	}
}
