package deep_cloning_of_subclass;

public class Main {
	
	
	public static void main(String[] args) {
		
		Eagle eagle = new Eagle("Eagle", "Fly", 3, 7.5, 80);
		
		System.out.println(eagle);
		
		Eagle cloneEagle = new Eagle(eagle);
		cloneEagle.area = "Bangladesh";
		
		
		System.out.println(cloneEagle);
		System.out.println(eagle);
		System.out.println(cloneEagle);
		

	}

}