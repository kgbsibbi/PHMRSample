package phmr;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import phmr.common.AddressSet;
import phmr.common.Id;
import phmr.common.NameWrapper;
import phmr.common.Organization;
import phmr.common.Telecom;

@XmlType(name="assignedAuthor")
public class AssignedAuthor {

	@XmlElement
	Id id;
	@XmlElement
	AddressSet addr;
	@XmlElement
	Telecom telecom;
	@XmlElement
	NameWrapper assignedPerson;
	@XmlElement
	Organization representedOrganization;
	
	public AssignedAuthor(){
		id = new Id("2.16.840.1.113883.19.5", "996-756-498");
		addr = new AddressSet();
		telecom = new Telecom("tel:555-555-1002", "WP");
		assignedPerson = new NameWrapper();
		representedOrganization = new Organization();
	}
	
}
