package phmr.common;

import javax.xml.bind.annotation.*;

@XmlType(name="telecom")
public class Telecom {
	
	@XmlAttribute
	String value;
	@XmlAttribute
	String use;
	
	public Telecom(){
		value="tel:555-555-5001";
	}
	
	public Telecom(String value){
		if(value.matches("tel:\\+?[-0-9().]+"))
			this.value = value;
		else
			this.value="tel:555-555-5001";
	}
	public Telecom(String value, String use){
		if(value.matches("tel:\\+?[-0-9().]+"))
			this.value = value;
		else
			this.value="tel:555-555-5001";
		
		if(use != null) this.use = use;
	}
}
