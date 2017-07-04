package phmr.common;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="nameWrapper")
public class NameWrapper {

	@XmlElement
	String name;
	
	public NameWrapper(String name){
		this.name = name;
	}
	
	public NameWrapper(){
		name = "Ann";
	}
}
