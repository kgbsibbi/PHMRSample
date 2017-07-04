package phmr;

import javax.xml.bind.annotation.*;

import phmr.common.CodeSystem;
import phmr.common.Id;
import phmr.common.TimeValue;

@XmlRootElement
@XmlType(name="ClinicalDocument")
public class ClinicalDocument {

	// Header Elements
	@XmlElement
	//TypeId typeId;
	Id typeId;
	@XmlElement
	Id templateId;
	@XmlElement
	Id id;
	@XmlElement
	CodeSystem code;
	@XmlElement
	String title;
	@XmlElement
	TimeValue effectiveTime;
	@XmlElement
	CodeSystem confienctialityCode;
	@XmlElement
	CodeSystem languageCode;
	@XmlElement
	RecordTarget recordTarget;
	@XmlElement
	Author author;
	@XmlElement
	Custodian custodian;
	@XmlElement
	InformationRecipient informationRecipient;
	@XmlElement
	DocumentationOf documentationOf;
	
	public void init(){
		typeId = new Id("2.16.840.1.113883.1.3", "POCD_HD000040");
		templateId = new Id("2.16.840.1.113883.10.20.9", null);
		id = new Id("db734647-fc99-424c-a864-7e3cda82e703", null);
		code = new CodeSystem("53576-5", "2.16.840.1.113883.6.1");
		title = new String("Good Health Personal Healthcare Monitoring Report");
		effectiveTime = new TimeValue(); // Now
		confienctialityCode  = new CodeSystem("N", "2.16.840.1.113883.5.25");
		languageCode = new CodeSystem("en-US", null);
		recordTarget = new RecordTarget();
		author = new Author();
		custodian = new Custodian();
		informationRecipient = new InformationRecipient();
		documentationOf = new DocumentationOf();
	}
}
