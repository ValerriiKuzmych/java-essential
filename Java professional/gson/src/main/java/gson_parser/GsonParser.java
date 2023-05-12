package gson_parser;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GsonParser {
	
	public void gsonWriter(String str) {
		
		 
	    Gson gson = new GsonBuilder().setPrettyPrinting().create();
	    
	    File file = new File("gsonFile.json");
	    
	    
	    
	    try {
	    	
	    	FileWriter writer = new FileWriter(file);
			writer.write(gson.toJson(str));
			
			writer.flush();
			writer.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}

}
