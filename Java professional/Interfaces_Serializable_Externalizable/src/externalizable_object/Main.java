package externalizable_object;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
	
	public static void main(String[] args) {
		
		Car car = new Car(280, 1800);
		
		Car.bodyType = "Hatchback";
		Car.brand = "FIAT";
		
		File file = new File ("C:\\Eclipse_Workspace\\Interfaces_Serializable_Externalizable\\src\\externalizable_object\\Car.txt");
		
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file)); 
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))){
			
			System.out.println(car + ", brand=" + Car.brand +", body type=" + Car.bodyType +"]");
			
			oos.writeObject(car);
			
			car = (Car) ois.readObject();
			
			System.out.println(car + ", brand=" + Car.brand +", body type=" + Car.bodyType +"]");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
		
	}

}
