package phmr.common;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="effectiveTime")
public class EffectiveTime {

	@XmlAttribute
	String value;
	
	@XmlElement
	ValueWrapper low;
	@XmlElement
	ValueWrapper high;
	
	public EffectiveTime(String value){
		this.value = value;
	}
	
	public EffectiveTime(String low, String high){
		this.low = new ValueWrapper(low);
		this.high = new ValueWrapper(high);
	}
}
