package phmr.elements;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="effectiveTime")
public class EffectiveTime {

	private String value;
	private ValueWrapper low;
	private ValueWrapper high;
	
	
	@XmlAttribute
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@XmlElement
	public ValueWrapper getLow() {
		return low;
	}

	public void setLow(ValueWrapper low) {
		this.low = low;
	}

	@XmlElement
	public ValueWrapper getHigh() {
		return high;
	}

	public void setHigh(ValueWrapper high) {
		this.high = high;
	}

	public EffectiveTime(String value){
		this.value = value;
	}
	
	public EffectiveTime(String low, String high){
		this.low = new ValueWrapper(low);
		this.high = new ValueWrapper(high);
	}
}
