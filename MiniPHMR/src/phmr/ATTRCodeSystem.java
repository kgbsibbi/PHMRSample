package phmr;

import javax.xml.bind.annotation.XmlAttribute;

public class ATTRCodeSystem {
	
	@XmlAttribute
	String code;
	@XmlAttribute
	String codeSystem;
	
	public ATTRCodeSystem(String code, String codeSystem){
		if(code != null) this.code = code;
		if(codeSystem != null) this.codeSystem = codeSystem;
	}

}
