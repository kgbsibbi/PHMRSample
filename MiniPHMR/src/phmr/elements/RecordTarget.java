package phmr.elements;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="recordTarget")
public class RecordTarget {
	
	private PatientRole patientRole;
	
	@XmlElement
	public PatientRole getPatientRole() {
		return patientRole;
	}

	public void setPatientRole(PatientRole patientRole) {
		this.patientRole = patientRole;
	}

	public RecordTarget(){
		patientRole = new PatientRole();
	}
}
