package phmr.elements;

import javax.xml.bind.annotation.XmlAttribute;

public class Id {
	private String root;
	private String extension;
	private String assigningAuthorityName;
	
	public Id(String root, String extension){
		this.root = root;
		this.extension = extension;
	}
	
	public Id(String root){
		this.root = root;
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
	
	@XmlAttribute
	public String getAssigningAuthorityName(){
		return assigningAuthorityName;
	}
	public void setAssigningAuthorityName(String name){
		assigningAuthorityName = name;
	}
}
