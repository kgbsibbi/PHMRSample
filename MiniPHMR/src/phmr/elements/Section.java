package phmr.elements;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="section")
public class Section {

	@XmlElement
	ArrayList<SectionSequence> list;
	
	public Section(int type){
		list = new ArrayList<SectionSequence>();
		
		if(type == 0){ // Data - vital sign or results
			SectionSequence s1 = new SectionSequence();
			s1.setTemplateId("2.16.840.1.113883.10.20.1.16", null);
			list.add(s1);
		}
	}
}
