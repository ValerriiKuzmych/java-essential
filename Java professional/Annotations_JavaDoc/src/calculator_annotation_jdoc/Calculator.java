package calculator_annotation_jdoc;

import java.lang.ArithmeticException;

public class Calculator {
	


	@CalculatorAnno(num1 = 15, num2 = 0)
	public void addition(double num1, double num2) {
		System.out.println((num1 + num2));
	}
	

	
	@CalculatorAnno(num1 = 15, num2 = 0)
	public void subtraction(double num1, double num2) {
		System.out.println((num1 - num2));
	}
	

  
    @CalculatorAnno(num1 = 10, num2 = 20)
	public void division(double num1, double num2) {
		double result;
		
		try {
			
		 result = num1 / num2;
			
		System.out.println(result);
		
		}catch(ArithmeticException e) {
			
			System.out.println(e);
			
		}
	}
	
	@CalculatorAnno(num1 = 15, num2 = 0)
	public void multiplication(double num1, double num2) {
		System.out.println((num1 * num2));
	}

}
