package calculator_annotation_jdoc;

import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
	
	
	public static String ADDITION = "+";
	public static String SUBTRACTION = "-";
    public static String DIVISON = "/";
    public static String MULTIPLICATION = "*";
    
	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		
		Class<?> cl = Calculator.class;
		
		try {
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			
			String operation = reader.readLine();
			
			
			if(operation.equals(ADDITION)){
			Method addition = cl.getDeclaredMethod("addition", double.class, double.class);
			
			CalculatorAnno calcAnnoAddition = addition.getAnnotation(CalculatorAnno.class);
			calculator.addition(calcAnnoAddition.num1(), calcAnnoAddition.num2());
			}
			
			if(operation.equals(SUBTRACTION)){
			Method subtraction = cl.getDeclaredMethod("subtraction", double.class, double.class);
			
			CalculatorAnno calcAnnoSubtraction = subtraction.getAnnotation(CalculatorAnno.class);
			calculator.subtraction(calcAnnoSubtraction.num1(), calcAnnoSubtraction.num2());
			}
			
			if(operation.equals(DIVISON)){
			Method division = cl.getDeclaredMethod("division", double.class, double.class);
			
			CalculatorAnno calcAnnoDivision = division.getAnnotation(CalculatorAnno.class);
			calculator.division(calcAnnoDivision.num1(), calcAnnoDivision.num2());
			}
			
			if(operation.equals(MULTIPLICATION)){
			Method multiplication = cl.getDeclaredMethod("multiplication", double.class, double.class);
			
			CalculatorAnno calcAnnoMultiplication = multiplication.getAnnotation(CalculatorAnno.class);
			calculator.multiplication(calcAnnoMultiplication.num1(), calcAnnoMultiplication.num2());
			}
			
			reader.close();
			
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}

}
