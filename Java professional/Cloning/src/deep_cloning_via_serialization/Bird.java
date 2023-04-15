package deep_cloning_via_serialization;

import java.io.Serializable;

public class Bird implements Serializable{
	
	private static final long serialVersionUID = -7569918420996385677L;
	final private String AREA = "Bangladesh";
	static int minAge;
    private String specie;
	transient private double weight;
	
	
	Bird (){}


	public Bird(String specie, double weight) {
		
		this.specie = specie;
		this.weight = weight;
	}


	
	public String getSpecie() {
		return specie;
	}


	public void setSpecie(String specie) {
		this.specie = specie;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}




	@Override
	public String toString() {
		return "Bird [AREA=" + AREA + ", specie=" + specie + ", weight=" + weight + "]";
	}
	
	
	
  
	

}
