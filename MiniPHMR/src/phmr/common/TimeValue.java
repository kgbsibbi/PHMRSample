package phmr.common;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="time")
public class TimeValue {
	
	@XmlAttribute
	protected String value;
	
	// Default Now
	public TimeValue(){
		Calendar c = Calendar.getInstance();
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddhhmmssZ");
		String now = format.format(c.getTime());
		value = now;
	}
	
	public TimeValue(String value){
		if(value != null) this.value = value;
	}

}
