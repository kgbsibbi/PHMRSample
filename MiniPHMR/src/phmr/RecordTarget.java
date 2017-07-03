package phmr;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="recordTarget")
public class RecordTarget {
	
	@XmlElement
	PatientRole patientRole;
	
	public RecordTarget(){
		patientRole = new PatientRole();
	}
}
