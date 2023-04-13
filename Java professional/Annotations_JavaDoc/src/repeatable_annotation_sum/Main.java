package repeatable_annotation_sum;

import java.lang.reflect.Method;

public class Main {
	
	@MathSumAnno(num1 = 50)
	@MathSumAnno(num2 = 100)
	public void mathSum(int num1, int num2) {
		
		System.out.println(num1 + num2);
	}

	
	
	public static void main(String[] args) {
		
		Main main = new Main();
		
		Class<?> cl = Main.class;
		
		
		try {
			
		   Method method = cl.getDeclaredMethod("mathSum", int.class, int.class);
			
		   MathSumAnnos msas = method.getAnnotation(MathSumAnnos.class);
		   
		   main.mathSum(msas.value()[0].num1(), msas.value()[1].num2());
		   
		 
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
