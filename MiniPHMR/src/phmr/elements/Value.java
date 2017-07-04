package phmr.elements;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="value",propOrder={"type", "value", "unit"})
public class Value {
	
	private String type;
	private String value;
	private String unit;
	
	@XmlAttribute(name="xsi:type")
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@XmlAttribute
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@XmlAttribute
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Value(String type, String value, String unit){
		this.type = type;
		this.value = value;
		this.unit = unit;
	}
	
	public Value(){
		
	}
}
