package phmr.common;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="addr")
public class AddressSet {
	
	@XmlElement
	String streetAddressLine;
	@XmlElement
	String city;
	@XmlElement
	String state;
	@XmlElement
	String postalCode;
	@XmlElement 
	String country;
	
	public AddressSet(){
		streetAddressLine = "123 Home Street";
		city = "Ann Arbor";
		state = "MI";
		postalCode="99999";
		country="USA";
	}
	
	public AddressSet(String streetAddressLine, String city, String state, String postalCode, String country){
		this.streetAddressLine = streetAddressLine;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.country = country;
	}
}
