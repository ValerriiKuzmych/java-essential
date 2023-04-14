package externalizable_object;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Car implements Externalizable{
	
	static String brand;
	static String bodyType;
    double maxSpeed;
	double weight;
	
	public Car() {}
	
	

	public Car(double maxSpeed, double weight) {
	
		this.maxSpeed = maxSpeed;
		this.weight = weight;
	}
	
	
    public static String getBrand() {
		return brand;
	}

	public static void setBrand(String brand) {
		Car.brand = brand;
	}

	public static String getBodyType() {
		return bodyType;
	}

	public static void setBodyType(String bodyType) {
		Car.bodyType = bodyType;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Car [maxSpeed=" + maxSpeed + ", weight=" + weight;
	}
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		
		out.writeObject(brand);
		out.writeObject(bodyType);
		out.writeDouble(maxSpeed);
		out.writeDouble(weight);
		
		
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		brand = (String) in.readObject();
		bodyType = (String) in.readObject();
		maxSpeed = (Double) in.readDouble();
		weight = (Double) in.readDouble();
	}
	
	

	
	
	
	

}
