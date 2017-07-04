package phmr;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import phmr.common.*;

@XmlType(name="intendedRecipient")
public class IntendedRecipient {

	@XmlElement
	Id id;
	@XmlElement
	AddressSet addr;
	@XmlElement
	Telecom telecom;
	@XmlElement
	NameWrapper informationRecipient;
	
	public IntendedRecipient(){
		id = new Id("8a54f393-8015-460c-abd2-f29aad15481c", null);
		addr = new AddressSet();
		telecom = new Telecom("tel:(999)555-1212", "DIR");
		informationRecipient = new NameWrapper("Good Health Hospital");
	}
}
