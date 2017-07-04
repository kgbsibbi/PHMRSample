package phmr.common;

import javax.xml.bind.annotation.XmlAttribute;

public class CodeSystem {
	
	@XmlAttribute
	String code;
	@XmlAttribute
	String codeSystem;
	
	public CodeSystem(String code, String codeSystem){
		if(code != null) this.code = code;
		if(codeSystem != null) this.codeSystem = codeSystem;
	}

}
