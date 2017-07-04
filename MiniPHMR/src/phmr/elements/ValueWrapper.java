package phmr.elements;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="valueWrapper")
public class ValueWrapper {

	@XmlAttribute
	String value;
	
	public ValueWrapper(String value){
		this.value = value;
	}
}
