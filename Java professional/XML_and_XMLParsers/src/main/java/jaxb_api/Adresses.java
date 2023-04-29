package jaxb_api;

import java.util.ArrayList;
import java.util.List;


import javax.xml.bind.annotation.*;

@XmlRootElement(name = "adresses")
@XmlAccessorType (XmlAccessType.FIELD)
public class Adresses {
	
	@XmlElement(name = "adress")
	 List<Adress> adresses = new ArrayList<Adress>();
	

}
