package sax_parser;

public class Cat {

	
	private String name;
	private String breed;
	private double weight;
	private int age;
	
	
	public Cat() {}
	


	public Cat(String name, String breed, double weight, int age) {
		
		this.name = name;
		this.breed = breed;
		this.weight = weight;
		this.age = age;
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


	public String getBreed() {
		return breed;
	}


	public void setBreed(String breed) {
		this.breed = breed;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}




	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + ", breed=" + breed + ", weight=" + weight + "]";
	}
	

}
