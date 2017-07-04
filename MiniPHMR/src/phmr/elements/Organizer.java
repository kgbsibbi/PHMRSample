package phmr.elements;

import java.util.ArrayList;

import javax.xml.bind.annotation.*;

@XmlType(name="organizer")
public class Organizer {
	
	@XmlAttribute
	String classCode;
	@XmlAttribute
	String moodCode;

	@XmlElement
	Id templateId;
	@XmlElement
	Id id;
	@XmlElement
	CodeSystem code;
	@XmlElement
	CodeSystem statusCode;
	@XmlElement
	ArrayList<Component4> component;
}
