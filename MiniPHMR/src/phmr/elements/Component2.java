package phmr.elements;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="component2")
public class Component2 {

	private StructuredBody structuredBody;
	
	public Component2(){
		structuredBody = new StructuredBody();
	}

	@XmlElement
	public StructuredBody getStructuredBody() {
		return structuredBody;
	}

	public void setStructuredBody(StructuredBody structuredBody) {
		this.structuredBody = structuredBody;
	}
}
