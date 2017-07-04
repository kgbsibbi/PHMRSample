package phmr;

import javax.xml.bind.annotation.*;

import phmr.common.CodeSystem;
import phmr.common.NameSet;
import phmr.common.TimeValue;

@XmlType(name="patient")
public class Patient {
	
	@XmlElement
	NameSet name;
	@XmlElement
	CodeSystem administrativeGenderCode;
	@XmlElement
	TimeValue birthTime;
	
	public Patient(){
		name = new NameSet("Ned", "Nuclear", null);
		administrativeGenderCode = new CodeSystem("M", "2.16.840.1.113883.5.1");
		birthTime = new TimeValue("19501212");
	}
	

}
