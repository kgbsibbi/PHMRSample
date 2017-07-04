package phmr.elements;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="custodian")
public class Custodian {
	
	private AssignedCustodian assignedCustodian;
	
	@XmlElement
	public AssignedCustodian getAssignedCustodian() {
		return assignedCustodian;
	}

	public void setAssignedCustodian(AssignedCustodian assignedCustodian) {
		this.assignedCustodian = assignedCustodian;
	}

	public Custodian(){
		assignedCustodian = new AssignedCustodian();
	}
}
