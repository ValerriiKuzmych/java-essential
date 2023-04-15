package deep_cloning_of_subclass;

public class Eagle extends Animal{
	
	double speed;
	
	
	
	
	public Eagle(String specie,String move, int age, double weight,double speed) {
		super(specie, move, age, weight);
		this.speed = speed;
		
	}
	
	
	public Eagle(Eagle that) {
		this(that.specie, that.move, that.age, that.weight, that.speed);
	}


	@Override
	public String toString() {
		return "Eagle [area=" + area + ", specie=" + specie + ", move=" + move + ", speed=" + speed + ", age=" + age
				+ ", weight=" + weight + "]";
	}
	
	
	
	

}
