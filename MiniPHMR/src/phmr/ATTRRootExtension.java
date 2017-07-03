package phmr;

import javax.xml.bind.annotation.XmlAttribute;

public class ATTRRootExtension {

	@XmlAttribute
	String root;
	@XmlAttribute
	String extension;
	
	public ATTRRootExtension(String root, String extension){
		if(root != null) this.root = root;
		if(extension != null) this.extension = extension;
	}
}
