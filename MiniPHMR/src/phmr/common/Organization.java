package phmr.common;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="organization")
public class Organization {

	// id, name, telecom, address를 가짐 
	@XmlElement
	Id id;
	@XmlElement
	String name;
	@XmlElement
	Telecom telecom;
	@XmlElement
	AddressSet addr;
	
	public Organization(){
		id = new Id("8a54f393-8015-460c-abd2-f29aad15481c", null);
		name = "Good Health Hospital";
		telecom = new Telecom("tel:(999)555-3004", "DIR");
		addr = new AddressSet();
	}
}
