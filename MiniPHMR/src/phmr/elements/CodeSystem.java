package phmr.elements;

import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlType(name="codeSystem")
public class CodeSystem {
	
	private String code;
	private String codeSystem;
	private String codeSystemName;
	private String displayName;
	
	private CodeSystem translation;
	
	public CodeSystem(String code, String codeSystem){
		this.code = code;
		this.codeSystem = codeSystem;
	}
	
	public CodeSystem(String code, String codeSystem, String displayName){
		this.code = code;
		this.codeSystem = codeSystem;
		this.displayName = displayName;
	}
	
	public CodeSystem(String code, String codeSystem, String codeSystemName, String displayName){
		this.code = code;
		this.codeSystem = codeSystem;
		this.codeSystemName = codeSystemName;
		this.displayName = displayName;
	}
	
	public CodeSystem(){
	}

	@XmlAttribute
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@XmlAttribute
	public String getCodeSystem() {
		return codeSystem;
	}

	public void setCodeSystem(String codeSystem) {
		this.codeSystem = codeSystem;
	}
	
	@XmlAttribute
	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	
	@XmlAttribute
	public String getCodeSystemName() {
		return codeSystemName;
	}

	public void setCodeSystemName(String name) {
		this.codeSystemName = displayName;
	}
	
	@XmlElement
	public CodeSystem getTranslation(){
		return translation;
	}
	public void setTranslation(CodeSystem system){
		this.translation = system;
	}
}
