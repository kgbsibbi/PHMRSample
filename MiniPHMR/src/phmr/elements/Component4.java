package phmr.elements;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="component4")
public class Component4 {

	private Observation observation;
	
	@XmlElement
	public Observation getObservation(){
		return observation;
	}
	public void setObservation(Observation observation){
		this.observation = observation;
	}
	
	public Component4(){
	}
	
	public Component4(int sectionType, int index){
		observation = new Observation(sectionType, index);
	}
}
