package phmr;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

import phmr.common.EffectiveTime;

@XmlType(name="serviceEvent")
public class ServiceEvent {
	@XmlAttribute
	String classCode;
	
	@XmlElement
	EffectiveTime effectiveTime;
	
	public ServiceEvent(String code, String low, String high){
		this.classCode = code;
		effectiveTime = new EffectiveTime(low, high);
	}
	
}
