package phmr.elements;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="organization", propOrder={"id", "name", "telecom", "addr"})
public class Organization {

	// id, name, telecom, address를 가짐 
	private Id id;
	private String name;
	private Telecom telecom;
	private AddressSet addr;
	
	@XmlElement
	public Id getId() {
		return id;
	}

	public void setId(Id id) {
		this.id = id;
	}

	@XmlElement
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement
	public Telecom getTelecom() {
		return telecom;
	}

	public void setTelecom(Telecom telecom) {
		this.telecom = telecom;
	}

	@XmlElement
	public AddressSet getAddr() {
		return addr;
	}

	public void setAddr(AddressSet addr) {
		this.addr = addr;
	}

	public Organization(){
		id = new Id("8a54f393-8015-460c-abd2-f29aad15481c", null);
		name = "Good Health Hospital";
		telecom = new Telecom("tel:(999)555-3004", "DIR");
		addr = new AddressSet();
	}
}
