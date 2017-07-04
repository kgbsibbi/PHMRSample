package phmr.elements;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="code")
public class Code {

	private String nullFlavor;
	private String originalText;
	
	@XmlAttribute
	public String getNullFlavor(){
		return nullFlavor;
	}
	public void setNullFlavor(String s){
		nullFlavor = s;
	}
	
	@XmlElement
	public String getOriginalText(){
		return originalText;
	}
	public void setOriginalText(String text){
		originalText = text;
	}
}
