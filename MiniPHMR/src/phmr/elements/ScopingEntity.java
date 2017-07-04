package phmr.elements;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="scopingEntity")
public class ScopingEntity {

	private String desc;
	
	@XmlElement
	public String getDesc(){
		return desc;
	}
	public void setDesc(String desc){
		this.desc = desc;
	}
	
	public ScopingEntity(){
		desc = "Nonin";
	}
}
