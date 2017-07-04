package phmr.elements;

import javax.xml.bind.annotation.*;

@XmlType(name="patient", propOrder={"name", "administrativeGenderCode", "birthTime"})
public class Patient {
	
	
	private FullName name;
	private CodeSystem administrativeGenderCode;
	private TimeValue birthTime;
	
	@XmlElement
	public FullName getName() {
		return name;
	}

	public void setName(FullName name) {
		this.name = name;
	}

	@XmlElement
	public CodeSystem getAdministrativeGenderCode() {
		return administrativeGenderCode;
	}

	public void setAdministrativeGenderCode(CodeSystem administrativeGenderCode) {
		this.administrativeGenderCode = administrativeGenderCode;
	}

	@XmlElement
	public TimeValue getBirthTime() {
		return birthTime;
	}

	public void setBirthTime(TimeValue birthTime) {
		this.birthTime = birthTime;
	}
	
	public Patient(){
		name = new FullName("Ned", "Nuclear", null);
		administrativeGenderCode = new CodeSystem("M", "2.16.840.1.113883.5.1");
		birthTime = new TimeValue("19501212");
	}
}
