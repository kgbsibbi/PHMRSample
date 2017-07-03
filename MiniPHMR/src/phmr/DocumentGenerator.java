package phmr;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class DocumentGenerator {

	public static void main(String[] args) {
		ClinicalDocument cd = new ClinicalDocument();
		cd.init();
		
		try {
			File file = new File("C:\\Tmp\\file.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(ClinicalDocument.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "urn:hl7-org:v3 ..\\..\\..\\0.Standards\\HL7\\CCD\\CDASchemas\\cda\\Schemas\\CDA.xsd");

			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(cd, file);
			jaxbMarshaller.marshal(cd, System.out);

		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

}
