package phmr.elements;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="assignedAuthor"
, propOrder={"id", "addr", "telecom", "assignedPerson", "representedOrganization"})
public class AssignedAuthor {
	private Id id;
	private AddressSet addr;
	private Telecom telecom;
	private NameWrapper assignedPerson;
	private Organization representedOrganization;
	
	public AssignedAuthor(){
		id = new Id("2.16.840.1.113883.19.5", "996-756-498");
		addr = new AddressSet();
		telecom = new Telecom("tel:555-555-1002", "WP");
		assignedPerson = new NameWrapper();
		representedOrganization = new Organization();
	}

	@XmlElement
	public Id getId() {
		return id;
	}

	public void setId(Id id) {
		this.id = id;
	}

	@XmlElement
	public AddressSet getAddr() {
		return addr;
	}

	public void setAddr(AddressSet addr) {
		this.addr = addr;
	}

	@XmlElement
	public Telecom getTelecom() {
		return telecom;
	}

	public void setTelecom(Telecom telecom) {
		this.telecom = telecom;
	}

	@XmlElement
	public NameWrapper getAssignedPerson() {
		return assignedPerson;
	}

	public void setAssignedPerson(NameWrapper assignedPerson) {
		this.assignedPerson = assignedPerson;
	}

	@XmlElement
	public Organization getRepresentedOrganization() {
		return representedOrganization;
	}

	public void setRepresentedOrganization(Organization representedOrganization) {
		this.representedOrganization = representedOrganization;
	}
	
}
