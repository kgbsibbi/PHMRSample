package phmr.common;

import javax.xml.bind.annotation.XmlAttribute;

public class Id {

	@XmlAttribute
	String root;
	@XmlAttribute
	String extension;
	
	public Id(String root, String extension){
		if(root != null) this.root = root;
		if(extension != null) this.extension = extension;
	}
}
