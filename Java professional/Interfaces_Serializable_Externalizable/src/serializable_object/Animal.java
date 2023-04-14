package serializable_object;

import java.io.Serializable;

public class Animal implements Serializable{
	
	
	private static final long serialVersionUID = 1861110740957711620L;
	
	private String name;
	private int age;
	private double weight;
	
	
	
	public Animal(String name, int age, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public double getWeight() {
		return weight;
	}



	public void setWeight(double weight) {
		this.weight = weight;
	}



	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}
	
	
	
	
	
	

}
