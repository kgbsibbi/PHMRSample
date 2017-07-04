package phmr;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import phmr.common.Organization;

@XmlType(name="assignedCustodian")
public class AssignedCustodian {

	@XmlElement
	Organization representedCustodianOrganization;
	
	public AssignedCustodian(){
		representedCustodianOrganization = new Organization();
	}
}
