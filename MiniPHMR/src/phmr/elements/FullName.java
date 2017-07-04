package phmr.elements;

import javax.xml.bind.annotation.*;

@XmlType(name="fullName")
public class FullName {
	private String given;
	private String family;
	private String suffix;
	
	@XmlElement
	public String getGiven() {
		return given;
	}

	public void setGiven(String given) {
		this.given = given;
	}

	@XmlElement
	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	@XmlElement
	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	
	public FullName(String given, String family, String suffix){
		this.given = given;
		this.family = family;
		this.suffix = suffix;
	}
}
