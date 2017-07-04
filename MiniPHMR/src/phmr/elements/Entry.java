package phmr.elements;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="entry")
public class Entry {
	
	private Organizer organizer;
	private String typeCode;
	private int sectionType=Section.VITAL;
	
	@XmlElement
	public Organizer getOrganizer(){
		return organizer;
	}
	
	public void setOrganizer(Organizer organizer){
		this.organizer = organizer;
	}
	
	@XmlAttribute
	public String getTypeCode(){
		return this.typeCode;
	}
	
	public void setTypeCode(String typeCode){
		this.typeCode = typeCode;
	}

	public Entry(){
		typeCode="COMP";
	}
	
	public Entry(int sectionType){
		this.sectionType = sectionType;
		typeCode="COMP";
		organizer = new Organizer(sectionType);
	}
}
