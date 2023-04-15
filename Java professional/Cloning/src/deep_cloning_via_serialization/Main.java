package deep_cloning_via_serialization;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

public class Main {
	
	public static void main(String[] args) {
		
		Bird originalBird = new Bird("Sparrow", 83);
		Bird.minAge = 1;
		
		System.out.println("Original" + originalBird);
		
		ByteArrayOutputStream  outputStream;
		ByteArrayInputStream inputStream;
		ObjectOutputStream oos;
		ObjectInputStream ois;
		
		try{ 
			
			outputStream = new ByteArrayOutputStream();
			outputStream.flush();
			outputStream.close();
			
			oos	= new ObjectOutputStream(outputStream);
			
			oos.writeObject(originalBird);
			
			oos.flush();
			oos.close();
			
			
			inputStream = new ByteArrayInputStream(outputStream.toByteArray());
			ois = new ObjectInputStream(inputStream);
			
			Bird deepCopyBird = (Bird) ois.readObject();
			deepCopyBird.setWeight(85);
			
		
			ois.close();
			inputStream.close();
	     	
			System.out.println("Deep copy" + deepCopyBird);
			System.out.println("Original" + originalBird);
			
			
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
