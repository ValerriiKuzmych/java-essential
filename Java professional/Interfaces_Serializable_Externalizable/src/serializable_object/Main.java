package serializable_object;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;


public class Main {
	
	public static void main(String[] args) {
		
		Animal animal = new Animal("Barsik", 8, 5.5);
		
		File fileAnimal = new File("C:\\Eclipse_Workspace\\Interfaces_Serializable_Externalizable\\src\\serializable_object\\Animal.txt");
		
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileAnimal)); 
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileAnimal))){
			
			System.out.println(animal);
			
			oos.writeObject(animal);
			
			animal = (Animal) ois.readObject();
			
			System.out.println(animal);
			
			
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
