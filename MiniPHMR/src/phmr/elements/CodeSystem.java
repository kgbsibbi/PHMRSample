package phmr.elements;

import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlType(name="code")
public class CodeSystem {
	
	private String code;
	private String codeSystem;
	
	public CodeSystem(String code, String codeSystem){
		if(code != null) this.code = code;
		if(codeSystem != null) this.codeSystem = codeSystem;
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
}
