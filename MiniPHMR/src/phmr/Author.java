package phmr;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import phmr.common.TimeValue;

@XmlType(name="author")
public class Author {
	
	@XmlElement
	TimeValue time;
	@XmlElement
	AssignedAuthor assignedAuthor;
	
	public Author(){
		time = new TimeValue();
		assignedAuthor = new AssignedAuthor();
	}
}
