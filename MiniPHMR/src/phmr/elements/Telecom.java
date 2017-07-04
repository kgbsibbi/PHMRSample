package phmr.elements;

import javax.xml.bind.annotation.*;

@XmlType(name="telecom")
public class Telecom {
	
	private String value;
	private String use;
	
	@XmlAttribute
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		if(value == null ){
			this.value="tel:555-555-5001";
			return;
		}
			
		if(value.matches("tel:\\+?[-0-9().]+"))
			this.value = value;
		else
			this.value="tel:555-555-5001";
	}

	@XmlAttribute
	public String getUse() {
		return use;
	}

	public void setUse(String use) {
		this.use = use;
	}
		
	public Telecom(){
		value="tel:555-555-5001";
	}
	
	public Telecom(String value){
		setValue(value);
	}
	public Telecom(String value, String use){
		setValue(value);
		if(use != null) this.use = use;
	}
}
