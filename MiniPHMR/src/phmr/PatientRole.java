package phmr;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import phmr.common.AddressSet;
import phmr.common.Id;
import phmr.common.Telecom;

@XmlType(name="patientRole")
public class PatientRole {

	@XmlElement
	Id id;
	@XmlElement
	AddressSet addr;
	@XmlElement
	Telecom telecom;
	@XmlElement
	Patient patient;
	
	public PatientRole(){
		id = new Id("2.16.840.1.113883.19.5", "996-756-495");
		addr = new AddressSet();
		telecom = new Telecom("tel:111-222-3333");
		patient = new Patient();
	}
}
