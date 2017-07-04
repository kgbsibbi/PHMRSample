package phmr.elements;

import java.util.ArrayList;

import javax.xml.bind.annotation.*;

@XmlType(name="organizer", propOrder={"templateId", "id", "code", "statusCode", "effectiveTime", "participant", "component"})
public class Organizer {
	// Attributes
	private String classCode;
	private String moodCode;

	//Elements
	private Id templateId;
	private Id id;
	private CodeSystem code;
	private CodeSystem statusCode;
	private TimeValue effectiveTime;
	private Participant participant;
	private ArrayList<Component4> component;
	
	//other
	private int sectionType = Section.VITAL;
	
	@XmlAttribute
	public String getClassCode(){
		return classCode;
	}
	public void setClassCode(String classCode){
		this.classCode = classCode;
	}
	@XmlAttribute
	public String getMoodCode(){
		return moodCode;
	}
	public void setMoodCode(String moodCode){
		this.moodCode = moodCode;
	}
	
	@XmlElement
	public Id getTemplateId(){
		return templateId;
	}
	public void setTemplateId(String root, String extension){
		if(templateId == null) templateId = new Id(root, extension);
		else{
			templateId.setRoot(root);
			templateId.setExtension(extension);
		}
	}
	
	@XmlElement
	public Id getId(){
		return id;
	}
	public void setId(String root, String extension){
		if(id == null) id = new Id(root, extension);
		else{
			id.setRoot(root);
			id.setExtension(extension);
		}
	}
	
	@XmlElement
	public CodeSystem getCode(){
		return code;
	}
	public void setCode(String code, String codeSystem){
		if(this.code == null) this.code = new CodeSystem(code, codeSystem);
		else{
			this.code.setCode(code);
			this.code.setCodeSystem(codeSystem);
		}
	}
	
	@XmlElement
	public CodeSystem getStatusCode(){
		return statusCode;
	}
	public void setStatusCode(String code, String codeSystem){
		if(statusCode == null) statusCode = new CodeSystem(code, codeSystem);
		else{
			statusCode.setCode(code);
			statusCode.setCodeSystem(codeSystem);
		}
	}
	
	@XmlElement
	public TimeValue getEffectiveTime(){
		return this.effectiveTime;
	}
	public void setEffectiveTime(TimeValue time){
		this.effectiveTime = time;
	}
	
	@XmlElement
	public Participant getParticipant(){
		return this.participant;
	}
	public void setParticipant(Participant participant){
		this.participant = participant;
	}
	
	@XmlElement(name="component")
	public ArrayList<Component4> getComponent(){
		return component;
	}
	public void setComponent(ArrayList<Component4> component){
		this.component = component;
	}
	
	public Organizer(){
		classCode = "CLUSTER";
		moodCode="ENV";
	}
	
	public Organizer(int sectionType){
		this.sectionType = sectionType;
		classCode = "CLUSTER";
		moodCode="EVN";
		
		if(sectionType == Section.VITAL){
			createVital();
		} else if(sectionType == Section.RESULTS){
			templateId = new Id("2.16.840.1.113883.10.20.1.35", null);
			id = new Id("b606a959-baab-4836-84a8-97c4e9857533", null);
			code = new CodeSystem("15220000", "2.16.840.1.113883.6.96", "Tests");
		} else if(sectionType == Section.EQUIPMENT){
			createEquipment();
		}
		statusCode = new CodeSystem("completed", null);
	}
	
	private void createEquipment(){
		templateId = new Id("2.16.840.1.113883.10.20.9.4", null);
		id = new Id("5a2ddd7e-f725-40f7-94f4-35d99218e587", null);
		statusCode = new CodeSystem("completed", null);
		effectiveTime = new TimeValue();
		participant = new Participant("SBJ");
		//participant
		component = new ArrayList<>();
		// frequency
		component.add(new Component4(sectionType, 0));
		// equipment
		component.add(new Component4(sectionType, 1));
	}
	
	private void createVital(){
		templateId = new Id("2.16.840.1.113883.10.20.1.35", null);
		id = new Id("b606a959-baab-4836-84a8-97c4e9857533", null);
		code = new CodeSystem("46680005", "2.16.840.1.113883.6.96", "Vital Signs");
		statusCode = new CodeSystem("completed", null);
		component = new ArrayList<>();
		for(int i=0; i <4; i++)
			component.add(new Component4(sectionType, i));
	}
}
