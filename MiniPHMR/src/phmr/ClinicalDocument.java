package phmr;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlType(name="ClinicalDocument")
public class ClinicalDocument {

	// Header Elements
	@XmlElement
	//TypeId typeId;
	ATTRRootExtension typeId;
	@XmlElement
	ATTRRootExtension templateId;
	@XmlElement
	ATTRRootExtension id;
	@XmlElement
	ATTRCodeSystem code;
	@XmlElement
	String title;
	@XmlElement
	TimeValue effectiveTime;
	@XmlElement
	ATTRCodeSystem confienctialityCode;
	@XmlElement
	ATTRCodeSystem languageCode;
	@XmlElement
	RecordTarget recordTarget;
	
	public void init(){
		typeId = new ATTRRootExtension("2.16.840.1.113883.1.3", "POCD_HD000040");
		templateId = new ATTRRootExtension("2.16.840.1.113883.10.20.9", null);
		id = new ATTRRootExtension("db734647-fc99-424c-a864-7e3cda82e703", null);
		code = new ATTRCodeSystem("53576-5", "2.16.840.1.113883.6.1");
		title = new String("Good Health Personal Healthcare Monitoring Report");
		effectiveTime = new TimeValue(); // Now
		confienctialityCode  = new ATTRCodeSystem("N", "2.16.840.1.113883.5.25");
		languageCode = new ATTRCodeSystem("en-US", null);
		recordTarget = new RecordTarget();
	}
}
