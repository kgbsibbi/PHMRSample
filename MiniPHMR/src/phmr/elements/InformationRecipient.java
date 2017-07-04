package phmr.elements;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="informationRecipient")
public class InformationRecipient {

	private IntendedRecipient intendedRecipient;
	
	@XmlElement
	public IntendedRecipient getIntendedRecipient() {
		return intendedRecipient;
	}

	public void setIntendedRecipient(IntendedRecipient intendedRecipient) {
		this.intendedRecipient = intendedRecipient;
	}

	public InformationRecipient(){
		intendedRecipient = new IntendedRecipient();
	}
}
