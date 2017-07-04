package phmr.elements;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="serviceEvent")
public class ServiceEvent {
	
	// attribute
	private String classCode;
	private EffectiveTime effectiveTime;
	
	@XmlAttribute
	public String getClassCode() {
		return classCode;
	}

	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}

	@XmlElement
	public EffectiveTime getEffectiveTime() {
		return effectiveTime;
	}

	public void setEffectiveTime(EffectiveTime effectiveTime) {
		this.effectiveTime = effectiveTime;
	}
	
	public ServiceEvent(String code, String low, String high){
		this.classCode = code;
		effectiveTime = new EffectiveTime(low, high);
	}
}
