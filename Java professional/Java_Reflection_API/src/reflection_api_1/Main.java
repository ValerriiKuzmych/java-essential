package reflection_api_1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class Main {
	
	private static final class SimpleClass{
		
		private String string = "Java";
		protected int number = 777;
        boolean bl = true;
        
        
      public  SimpleClass(int number){
        	
        	this.number = number;
        	
        }
      public  SimpleClass(String string){
        	
        	this.string= string;
        }
     public   SimpleClass(boolean bl){
        	
        	this.bl = bl;
        }
		public int getNumber() {
			return number;
		}
		public void setNumber(int number) {
			this.number = number;
		}
		public boolean isBl() {
			return bl;
		}
		public void setBl(boolean bl) {
			this.bl = bl;
		}
        
        
		
	
		
	}
	
	
	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		
		Class cl = SimpleClass.class;
		
		
		
		
		
		Constructor<?>[] constructors = cl.getConstructors();
		
		int i = 0;
		
		for(Constructor<?> ctr : constructors) {
			
			System.out.print("Constructor " + (++i) + ": ");
			
			Class<?>[] paramTypes =  ctr.getParameterTypes();
			
			for(Class<?> paramType : paramTypes) {
				
				System.out.print(paramType.getName());
			}
			System.out.println(" ");
			
		}
		System.out.println(" ");
		
		Method[] methods = cl.getMethods();
		
		for(Method mtd : methods) {
			
			System.out.println("Method name " + mtd.getName());
			System.out.println("Method return type " + mtd.getReturnType());
			
			Class<?>[] paramTypes = mtd.getParameterTypes();
			
			for(Class<?> paramType: paramTypes) {
				
				System.out.println("Method parameter type " + paramType.getName());
				
			}
			
			
			
			System.out.println("  ");
			
		}
		
		
		Field[] fields = cl.getDeclaredFields();
		
		for(Field field: fields) {
			
			System.out.println("Field name " + field.getName());
			System.out.println("Field type " + field.getType());
			System.out.println("Field modificator " + field.getModifiers());
			System.out.println("  ");
		}
				
				
		
		
		
		
		
		
	
	
	
	}
	
	
	
	

}
