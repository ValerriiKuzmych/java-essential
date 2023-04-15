package deep_and_shallow_cloning;

public class Main {
	
       public static void main(String[] args) {
    	   
    	   Car originalCar = new Car("BMW", 280, 1800);
    	   Car deepCopyCar = new Car(originalCar);
    	   
    	   System.out.println("Oroginal: " + originalCar);
    	   
    	   try {
			Car cloneCar = (Car) originalCar.clone();
			System.out.println("Clone: " + cloneCar);
	    	   
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	   
    	   System.out.println("Deep copy: " + deepCopyCar);
       }

}
