package phmr.elements;

import javax.xml.bind.annotation.XmlAttribute;

public class Id {
	private String root;
	private String extension;
	
	public Id(String root, String extension){
		if(root != null) this.root = root;
		if(extension != null) this.extension = extension;
	}

	@XmlAttribute
	public String getRoot() {
		return root;
	}

	public void setRoot(String root) {
		this.root = root;
	}

	@XmlAttribute
	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}
}
