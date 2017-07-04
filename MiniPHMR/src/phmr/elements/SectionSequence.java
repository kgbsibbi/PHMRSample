package phmr.elements;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="sectionsequence")
public class SectionSequence {

	@XmlElement
	Id templateId;
	@XmlElement
	CodeSystem code;
	@XmlElement
	String title;
	@XmlElement
	String text;
	@XmlElement
	Entry entry;
	@XmlElement
	Component5 component;
	
	@XmlAttribute
	String moodCode;
	
	public void setTemplateId(String root, String extension){
		if(templateId == null) templateId = new Id(root, extension);
		else {
			templateId.setRoot(root);
			templateId.setExtension(extension);
		}
	}
	
	public void setCode(String code, String system){
		if(this.code == null) this.code = new CodeSystem(code, system);
		else{
			this.code.setCode(code);
			this.code.setCodeSystem(system);
		}
	}
}
