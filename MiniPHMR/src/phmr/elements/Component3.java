package phmr.elements;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="component3")
public class Component3 {
	private Section section;
	
	@XmlElement
	public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
	}

	public Component3(Section section){
		this.section = section;
	}
	
	public Component3(){
		section = new Section(0); // Data Section
	}
}
