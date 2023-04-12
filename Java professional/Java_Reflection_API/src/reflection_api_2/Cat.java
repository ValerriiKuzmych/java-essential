package reflection_api_2;

import java.lang.reflect.Field;

public class Cat {
	
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		
	Animal animal = new Animal();
	Class<?> classAnimal = Animal.class;
	
	Field[] fields = classAnimal.getDeclaredFields();
	
	for(Field field : fields) {
		
		System.out.println(field.getName());
		System.out.println(field.getType());
		System.out.println();
	}
	
	
	
	
	
	Field fieldIntAge = classAnimal.getDeclaredField("age");
	Field fieldStringName = classAnimal.getDeclaredField("name");
	Field fieldDoubleWeight = classAnimal.getDeclaredField("weight");
	
	
	
	fieldStringName.setAccessible(true);
	fieldStringName.set(animal, "Galina");
	
	fieldIntAge.setAccessible(true);
	fieldIntAge.set(animal, 10);
	
	fieldDoubleWeight.setAccessible(true);
	fieldDoubleWeight.set(animal, 5.5);
	
    
	System.out.println(fieldIntAge.getInt(animal));
	System.out.println(fieldStringName.get(animal));
	System.out.println(fieldDoubleWeight.getDouble(animal));
	
	
	
	

	
	
	
	
	

}
}
