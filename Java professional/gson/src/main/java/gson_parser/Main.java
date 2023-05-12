package gson_parser;



public class Main {
	
	
public static void main(String[] args) {
		
		String adress =  "{ \"country\": \"Germany\", \"city\": \"Berlin\", \"street\": \"Dessauer\": \"house\": 43 }";
		GsonParser parser = new GsonParser();
		
		parser.gsonWriter(adress);
	}

}
