package phmr.elements;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="structuredBody")
public class StructuredBody {

	@XmlElement
	ArrayList<Component3> component;
	
	Component3 data;
	Component3 equipment;
	
	public void setComponents(ArrayList<Component3> component){
		this.component = component;
	}
	
	public ArrayList<Component3> getComponent(){
		return component;
	}
	
	public StructuredBody(){
		component = new ArrayList<>();
		
		data = new Component3(createDataSection());
		equipment = new Component3(createEquipmentSection());
		
		component.add(data);
		component.add(equipment);
	}
	
	private Section createDataSection(){
		Section section = new Section(0);
		return section;
	}
	
	private Section createEquipmentSection(){
		Section section = new Section(1);
		return section;
	}
}
