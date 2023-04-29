package jaxb_api;

import java.io.File;

import javax.xml.bind.*;

public class Main {
	public static void main(String[] args) {

		File xmlFile = new File("C:\\Eclipse_Workspace\\XML_and_XMLParsers\\src\\main\\java\\jaxb_api\\file.xml");
		
         Adress adress = new Adress("Kiev", "Lenina", 15, 13456, 2342432);
         Adress adress1 = new Adress("Berlin", "Dessauer", 43, 12689, 4523435);
         Adress adress2 = new Adress("Napoli", "Beach", 12, 12993, 4565576);
        
         Adresses adresses = new Adresses();
		

		adresses.adresses.add(adress);
		adresses.adresses.add(adress1);
		adresses.adresses.add(adress2);

		try {

			JAXBContext jc = JAXBContext.newInstance(Adresses.class, Adress.class);
			Marshaller marschaller = jc.createMarshaller();
			marschaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

			Unmarshaller unmarschaller = jc.createUnmarshaller();

			marschaller.marshal(adresses, xmlFile);

			Adresses adresses1 = (Adresses) unmarschaller.unmarshal(xmlFile);

			for (Adress tmp : adresses1.adresses) {
                System.out.println("ORDER: " + tmp.orderNumber);
				System.out.println("City: " + tmp.city);
				System.out.println("Street: " + tmp.street);
				System.out.println("House: " + tmp.house);
				System.out.println("Index: " + tmp.index);
				System.out.println("**************");

			}

		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
