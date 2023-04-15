package deep_cloning_of_subclass;

public class Animal {
	
	
	
	
	String area = "Thailand";
	String specie;
	String move;
    int age;
	double weight;
	
	
	
	
	
	public Animal() {
	}





	public Animal(String specie, String move, int age, double weight) {
		
		this.specie = specie;
		this.move = move;
		this.age = age;
		this.weight = weight;
	}





	@Override
	public String toString() {
		return "Animal [area=" + area + ", specie=" + specie + ", move=" + move + ", age=" + age + ", weight=" + weight
				+ "]";
	}
	
	
	
	
	
	

}
