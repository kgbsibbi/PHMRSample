package phmr;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="patientRole")
public class PatientRole {

	@XmlElement
	ATTRRootExtension id;
	@XmlElement
	Address addr;
	@XmlElement
	Telecom telecom;
	@XmlElement
	Patient patient;
	
	public PatientRole(){
		id = new ATTRRootExtension("2.16.840.1.113883.19.5", "996-756-495");
		addr = new Address();
		telecom = new Telecom("tel:111-222-3333");
		patient = new Patient();
	}
}
