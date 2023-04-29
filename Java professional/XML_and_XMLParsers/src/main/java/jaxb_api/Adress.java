package jaxb_api;



import javax.xml.bind.annotation.*;


public class Adress {
	
	
    

	@XmlElement(name = "city")
	String city;

	@XmlElement(name = "street")
	String street;

	@XmlElement(name = "house")
	int house;
	
	@XmlElement(name = "index")
	int index;

	@XmlAttribute(name = "order_number")
	int orderNumber;

	public Adress() {
	}

	public Adress(String city, String street, int house, int index, int orderNumber) {

		this.city = city;
		this.street = street;
		this.house = house;
		this.orderNumber = orderNumber;
		this.index = index;

	}


	

}
