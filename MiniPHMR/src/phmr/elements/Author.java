package phmr.elements;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="author", propOrder={"time", "assignedAuthor"})
public class Author {
	
	private TimeValue time;
	private AssignedAuthor assignedAuthor;
	
	@XmlElement
	public TimeValue getTime() {
		return time;
	}

	public void setTime(TimeValue time) {
		this.time = time;
	}

	@XmlElement
	public AssignedAuthor getAssignedAuthor() {
		return assignedAuthor;
	}

	public void setAssignedAuthor(AssignedAuthor assignedAuthor) {
		this.assignedAuthor = assignedAuthor;
	}

	public Author(){
		time = new TimeValue();
		assignedAuthor = new AssignedAuthor();
	}
}
