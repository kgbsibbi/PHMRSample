package phmr;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="custodian")
public class Custodian {

	@XmlElement
	AssignedCustodian assignedCustodian;
	
	public Custodian(){
		assignedCustodian = new AssignedCustodian();
	}
}
