package deep_and_shallow_cloning;

public class Car implements Cloneable {
	
	private String brand;
	private double maxSpeed;
	private double weight;
	
	
	
	public Car() {}

	public Car(String brand, double maxSpeed, double weight) {
		//super();
		this.brand = brand;
		this.maxSpeed = maxSpeed;
		this.weight = weight;
	}
	
	public Car(Car that) {
		this(that.getBrand(), that.getMaxSpeed(), that.weight);
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
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
		return "Car [brand=" + brand + ", maxSpeed=" + maxSpeed + ", weight=" + weight + "]";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

  
	

}
