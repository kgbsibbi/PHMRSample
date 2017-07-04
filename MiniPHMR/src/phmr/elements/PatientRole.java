package phmr.elements;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="patientRole", propOrder={"id", "addr", "telecom", "patient"})
public class PatientRole {

	private Id id;
	private AddressSet addr;
	private Telecom telecom;
	private Patient patient;
	
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
	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	public PatientRole(){
		id = new Id("2.16.840.1.113883.19.5", "996-756-495");
		addr = new AddressSet();
		telecom = new Telecom("tel:111-222-3333");
		patient = new Patient();
	}
}
