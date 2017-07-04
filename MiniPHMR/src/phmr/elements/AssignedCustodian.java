package phmr.elements;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="assignedCustodian")
public class AssignedCustodian {
	
	private Organization representedCustodianOrganization;
	
	@XmlElement
	public Organization getRepresentedCustodianOrganization() {
		return representedCustodianOrganization;
	}

	public void setRepresentedCustodianOrganization(Organization representedCustodianOrganization) {
		this.representedCustodianOrganization = representedCustodianOrganization;
	}

	public AssignedCustodian(){
		representedCustodianOrganization = new Organization();
	}
}
