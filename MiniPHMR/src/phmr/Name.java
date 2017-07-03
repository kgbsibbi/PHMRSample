package phmr;

import javax.xml.bind.annotation.*;

@XmlType(name="name")
public class Name {
	
	//@XmlValue
	//String value;
	
	@XmlElement
	String given;
	@XmlElement
	String family;
	@XmlElement
	String suffix;
	
	//public Name(String value){
	//	this.value = value;
	//}
	
	public Name(String given, String family, String suffix){
		this.given = given;
		this.family = family;
		this.suffix = suffix;
	}
}
