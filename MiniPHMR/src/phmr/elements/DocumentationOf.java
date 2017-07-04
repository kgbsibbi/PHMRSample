package phmr.elements;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="documentationOf")
public class DocumentationOf {

	private ServiceEvent serviceEvent;
	
	@XmlElement
	public ServiceEvent getServiceEvent() {
		return serviceEvent;
	}

	public void setServiceEvent(ServiceEvent serviceEvent) {
		this.serviceEvent = serviceEvent;
	}

	public DocumentationOf(){
		serviceEvent = new ServiceEvent("MPROT", "20080501", "20080531");
	}
}
