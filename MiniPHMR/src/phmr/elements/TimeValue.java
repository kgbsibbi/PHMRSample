package phmr.elements;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="time")
public class TimeValue {

	private String value;
	
	@XmlAttribute
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		if(value != null) this.value = value;
		else {
			Calendar c = Calendar.getInstance();
			SimpleDateFormat format = new SimpleDateFormat("yyyyMMddhhmmssZ");
			String now = format.format(c.getTime());
			this.value = now;
		}
	}

	// Default Now
	public TimeValue(){
		setValue(null);
	}
	
	public TimeValue(String value){
		setValue(value);
	}

}
