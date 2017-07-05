package phmr.elements;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="section", propOrder={"templateId", "code", "title","text", "entry"})
public class Section {

	public static final int VITAL = 0;
	public static final int RESULTS = 1;
	public static final int EQUIPMENT = 2;
	
	private ArrayList<Id> templateIds;
	private CodeSystem code;
	private String title;
	private String text;
	private ArrayList<Entry> entry;
	private int type = 0;
	
	@XmlElement(name="templateId")
	public ArrayList<Id> getTemplateId(){
		return templateIds;
	}
	
	public void setTemplateId(ArrayList<Id> templateIds){
		this.templateIds = templateIds;
	}
	
	@XmlElement
	public CodeSystem getCode(){
		return code;
	}
	
	public void setCode(String code, String codeSystem){
		if (this.code == null) this.code = new CodeSystem(code, codeSystem);
		else {
			this.code.setCode(code);
			this.code.setCodeSystem(codeSystem);
		}
	}
	
	@XmlElement
	public String getTitle(){
		return title;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	@XmlElement
	public String getText(){
		return text;
	}
	
	public void setText(String text){
		this.text = text;
	}
	
	@XmlElement(name="entry")
	public ArrayList<Entry> getEntry(){
		return entry;
	}
	
	public void setEntry(ArrayList<Entry> entry){
		this.entry = entry;
	}
	
	public Section(int type){
		this.type = type;
		templateIds = new ArrayList<>();
		entry = new ArrayList<>();
		code = new CodeSystem();
		
		if(type == VITAL){
			templateIds.add(new Id("2.16.840.1.113883.10.20.1.16", null));
			templateIds.add(new Id("2.16.840.1.113883.10.20.9.2", null));
			code.setCode("8716-3");
			code.setCodeSystem("2.16.840.1.113883.6.1");
			title="Vital Signs";
			text="155mm[Hg]";
		}
		else if(type == RESULTS){
			templateIds.add(new Id("2.16.840.1.113883.10.20.1.14", null));
			templateIds.add(new Id("2.16.840.1.113883.10.20.9.14", null));
			code.setCode("30954-2");
			code.setCodeSystem("2.16.840.1.113883.6.1");
			title = "Results";
			text="Weight";
		}
		else if(type == EQUIPMENT){
			templateIds.add(new Id("2.16.840.1.113883.10.20.1.7", null));
			templateIds.add(new Id("2.16.840.1.113883.10.20.9.1", null));
			code.setCode("46264-8");
			code.setCodeSystem("2.16.840.1.113883.6.1");
			title = "Medical Equipment";
			text="Pulse Master 2000 (ver. 2.1)";
		}
		
		entry.add(new Entry(type));
	}
}
