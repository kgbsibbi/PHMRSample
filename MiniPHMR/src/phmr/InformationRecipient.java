package phmr;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="informationRecipient")
public class InformationRecipient {

	@XmlElement
	IntendedRecipient intendedRecipient;
	
	public InformationRecipient(){
		intendedRecipient = new IntendedRecipient();
	}
}
