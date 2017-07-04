package phmr.elements;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="participantRole",
propOrder={"templateId", "id", "code", "playingDevice", "scopingEntity"})
public class ParticipantRole {
	//Attribute
	private String classCode;

	// Element
	private ArrayList<Id> templateId;
	private Id id;
	private Code code;
	private PlayingDevice playingDevice;
	private ScopingEntity scopingEntity;
	
	
	@XmlAttribute
	public String getClassCode(){
		return classCode;
	}
	public void setClassCode(String code){
		this.classCode = code;
	}
	
	@XmlElement(name="templateId")
	public ArrayList<Id> getTemplateId(){
		return templateId;
	}
	public void setTemplateId(ArrayList<Id> id){
		templateId = id;
	}
	
	@XmlElement
	public Id getId(){
		return id;
	}
	public void setId(Id id){
		this.id = id;
	}
	
	@XmlElement
	public Code getCode(){
		return code;
	}
	public void setCode(Code code){
		this.code = code;
	}
	
	@XmlElement
	public PlayingDevice getPlayingDevice(){
		return playingDevice;
	}
	public void setPlayingDevice(PlayingDevice device){
		playingDevice = device;
	}
	
	@XmlElement
	public ScopingEntity getScopingEntity(){
		return scopingEntity;
	}
	public void setScopingEntity(ScopingEntity entity){
		scopingEntity = entity;
	}
	
	public ParticipantRole(){
		id = new Id("1.2.840.10004.1.1.1.0.0.1.0.0.1.2680", "1F-3E-46-78-9A-BC-DE-F1");
		id.setAssigningAuthorityName("EUI-64");
	}
	
	public void createDevice(){
		classCode = "MANU";
		templateId = new ArrayList<>();
		templateId.add(new Id("2.16.840.1.113883.10.20.1.52"));
		templateId.add(new Id("2.16.840.1.113883.10.20.9.9"));
		id = new Id("1.2.840.10004.1.1.1.0.0.1.0.0.1.2680", "1F-3E-46-78-9A-BC-DE-F1");
		id.setAssigningAuthorityName("EUI-64");
		code = new Code();
		code.setNullFlavor("OTH");
		code.setOriginalText("Regulated Device");
		playingDevice = new PlayingDevice();
		scopingEntity = new ScopingEntity();
	}
}
