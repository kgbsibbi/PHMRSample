package phmr.elements;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="observation",
propOrder={"templateId", "id", "code", "statusCode", "effectiveTime", "value", "participant"  }) 
	//	, "component"})
public class Observation {
	// Attributes
	private String classCode;
	private String moodCode;
	//Element
	private ArrayList<Id> templateId;
	private Id id;
	private CodeSystem code;
	private CodeSystem translation; // code's child
	private CodeSystem statusCode;
	private TimeValue effectiveTime;
	private Value value;
	private Participant participant;
	
	
	@XmlAttribute
	public String getClassCode(){
		return classCode;
	}
	public void setClassCode(String code){
		this.classCode = code;
	}
	@XmlAttribute
	public String getMoodCode(){
		return moodCode;
	}
	public void setMoodCode(String code){
		this.moodCode = code;
	}
	
	@XmlElement(name="templateId")
	public ArrayList<Id> getTemplateId(){
		return templateId;
	}
	public void setTemplateId(ArrayList<Id> templateId){
		this.templateId = templateId;
	}
	
	@XmlElement
	public Id getId(){
		return id;
	}
	public void setId(Id id){
		this.id = id;
	}
	
	@XmlElement
	public CodeSystem getCode(){
		return code;
	}
	public void setCode(CodeSystem code){
		this.code = code;
	}
	
	@XmlElement
	public CodeSystem getStatusCode(){
		return statusCode;
	}
	public void setStatusCode(CodeSystem code){
		statusCode = code;
	}
	
	@XmlElement
	public TimeValue getEffectiveTime(){
		return effectiveTime;
	}
	public void setEffectiveTime(TimeValue time){
		this.effectiveTime = time;
	}
	
	@XmlElement
	public Value getValue(){
		return value;
	}
	public void setValue(Value value){
		this.value = value;
	}
	
	@XmlElement
	public Participant getParticipant(){
		return participant;
	}
	public void setParticipant(Participant participant){
		this.participant = participant;
	}
	
	public Observation(int sectionType, int index){
		if(sectionType == Section.VITAL){
			createVitalObservation(index);
		} else if(sectionType == Section.EQUIPMENT){
			createEquipmentObservation(index);
		}
	}
	
	private void createVitalObservation(int index){
		classCode="OBS";
		moodCode="EVN";
		templateId = new ArrayList<>();
		templateId.add(new Id("2.16.840.1.113883.10.20.1.31"));
		templateId.add(new Id("2.16.840.1.113883.10.20.9.8"));
		
		if(index == 0){
			id = new Id("fde90f67-529b-49e4-871b-bab296e8d499");
			translation = new CodeSystem("MDC_PRESS_BLD_NONINV_SYS", "2.16.840.1.113883.6.24",
					"MDC", "Systolic BP");
			code = new CodeSystem("271649006", "2.16.840.1.113883.6.96",
					"SNOMED CT", "Systolic blood pressure");
			code.setTranslation(translation);
			statusCode = new CodeSystem("completed", null);
			effectiveTime = new TimeValue();
			value = new Value("PQ", "155", "mm[Hg]");
			participant = new Participant();
			participant.setTypeCode("DEV");
			participant.setParticipantRole(new ParticipantRole());
		} else if (index == 1){
			id = new Id("7e21aa1e-a786-40e2-a269-eca392ff5f08");
			translation = new CodeSystem("MDC_PRESS_BLD_NONINV_DIA", "2.16.840.1.113883.6.24",
					"MDC", "Diastolic BP");
			code = new CodeSystem("271650006", "2.16.840.1.113883.6.96",
					"SNOMED CT", "Diastolic blood pressure");
			code.setTranslation(translation);
			statusCode = new CodeSystem("completed", null);
			effectiveTime = new TimeValue();
			value = new Value("PQ", "70", "mm[Hg]");
			participant = new Participant();
			participant.setTypeCode("DEV");
			participant.setParticipantRole(new ParticipantRole());
		} else if (index == 2){
			id = new Id("10252df8-57a9-4705-8d0c-999e28453230");
			translation = new CodeSystem("MDC_PRESS_BLD_NONINV_MEAN", "2.16.840.1.113883.6.24",
					"MDC", "Mean BP");
			code = new CodeSystem("6797001", "2.16.840.1.113883.6.96",
					"SNOMED CT", "Mean blood pressure");
			code.setTranslation(translation);
			statusCode = new CodeSystem("completed", null);
			effectiveTime = new TimeValue();
			value = new Value("PQ", "120", "mm[Hg]");
			participant = new Participant();
			participant.setTypeCode("DEV");
			participant.setParticipantRole(new ParticipantRole());
		}	else if (index == 3){
			id = new Id("f15b3846-269a-4c22-8bd5-9bb37fff94bc");
			translation = new CodeSystem("MDC_PULS_RATE_NON_INV", "2.16.840.1.113883.6.24",
					"MDC", "Pulse");
			code = new CodeSystem("78564009", "2.16.840.1.113883.6.96",
					"SNOMED CT", "Pulse rate");
			code.setTranslation(translation);
			statusCode = new CodeSystem("completed", null);
			effectiveTime = new TimeValue();
			value = new Value("PQ", "88", "{beat}/min");
			participant = new Participant();
			participant.setTypeCode("DEV");
			participant.setParticipantRole(new ParticipantRole());
		}
	}
	
	private void createEquipmentObservation(int index){
		classCode="OBS";
		moodCode="DEF";
		templateId = new ArrayList<>();
		
		if(index ==0){ // frequency
			templateId.add(new Id("2.16.840.1.113883.10.20.9.10"));
			code = new CodeSystem("MDC_ATTR_TIME_PD_SAMP", "2.16.840.1.113883.6.24");
			value = new Value("PQ", "10","ms");
			
		} else if(index == 1){ // resolution
			templateId.add(new Id("2.16.840.1.113883.10.20.9.6"));
			code = new CodeSystem("17441009", "2.16.840.1.113883.6.96");
			code.setDisplayName("Resolution threshold (observable entity)");
			value=new Value("PQ", ".1", "mm[Hg]");
		}
	}
}
