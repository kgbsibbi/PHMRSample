package phmr.elements;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="participant")
public class Participant {

	private String typeCode;
	private ParticipantRole participantRole;
	
	@XmlAttribute
	public String getTypeCode(){
		return typeCode;
	}
	public void setTypeCode(String code){
		typeCode = code;
	}
	
	@XmlElement
	public ParticipantRole getParticipantRole(){
		return this.participantRole;
	}
	public void setParticipantRole(ParticipantRole role){
		this.participantRole = role;
	}
	
	public Participant(){
		participantRole = new ParticipantRole();
	}
	
	public Participant(String typeCode){
		this.typeCode = typeCode;
		if(typeCode.equals("SBJ")){
			participantRole = new ParticipantRole();
			participantRole.createDevice();
		}
	}
}
