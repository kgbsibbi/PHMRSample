package phmr;

import javax.xml.bind.annotation.*;

@XmlType(name="patient")
public class Patient {
	
	@XmlElement
	Name name;
	@XmlElement
	ATTRCodeSystem administrativeGenderCode;
	@XmlElement
	TimeValue birthTime;
	
	public Patient(){
		name = new Name("Ned", "Nuclear", null);
		administrativeGenderCode = new ATTRCodeSystem("M", "2.16.840.1.113883.5.1");
		birthTime = new TimeValue("19501212");
	}
	

}
