package phmr.common;

import javax.xml.bind.annotation.*;

@XmlType(name="name")
@XmlAccessorType(XmlAccessType.FIELD)
public class NameSet {
	
	@XmlElement(required = false)
	String given;
	@XmlElement(required = false)
	String family;
	@XmlElement(required = false)
	String suffix;
	
	public NameSet(String given, String family, String suffix){
		this.given = given;
		this.family = family;
		this.suffix = suffix;
	}
}
