package phmr.elements;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="playingDevice")
public class PlayingDevice {

	private CodeSystem code;
	private CodeSystem translation;
	private String manufacturerModelName;
	
	@XmlElement
	public CodeSystem getCode(){
		return code;
	}
	public void setCode(CodeSystem code){
		this.code = code;
	}
	
	@XmlElement
	public String getManufacturerModelName(){
		return this.manufacturerModelName;
	}
	public void setManufacturerModelName(String name){
		this.manufacturerModelName = name;
	}
	
	public PlayingDevice(){
		translation = new CodeSystem("32033000", "2.16.840.1.113883.6.96");
		translation.setCodeSystemName("SNOMED CT");
		translation.setDisplayName("Arterial pressure monitor");
		code = new CodeSystem("MDC_DEV_SPEC_PROFILE_BP", "2.16.840.1.113883.6.24");
		code.setCodeSystemName("MDC");
		code.setDisplayName("BloodPressure Monitor");
		code.setTranslation(translation);
		manufacturerModelName = "Model: Pulse Master 2000";
	}
	
}
