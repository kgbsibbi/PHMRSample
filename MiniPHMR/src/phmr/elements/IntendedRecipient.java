package phmr.elements;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import phmr.elements.*;

@XmlType(name="intendedRecipient", propOrder={"id", "addr", "telecom", "informationRecipient"})
public class IntendedRecipient {

	private Id id;
	private AddressSet addr;
	private Telecom telecom;
	private NameWrapper informationRecipient;
	
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
	public NameWrapper getInformationRecipient() {
		return informationRecipient;
	}

	public void setInformationRecipient(NameWrapper informationRecipient) {
		this.informationRecipient = informationRecipient;
	}
	
	public IntendedRecipient(){
		id = new Id("8a54f393-8015-460c-abd2-f29aad15481c", null);
		addr = new AddressSet();
		telecom = new Telecom("tel:(999)555-1212", "DIR");
		informationRecipient = new NameWrapper("Good Health Hospital");
	}
}
