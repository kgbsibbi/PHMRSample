package phmr;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="documentationOf")
public class DocumentationOf {

	@XmlElement
	ServiceEvent serviceEvent;
	
	public DocumentationOf(){
		serviceEvent = new ServiceEvent("MPROT", "20080501", "20080531");
	}
}
