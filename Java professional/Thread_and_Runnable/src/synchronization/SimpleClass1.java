package synchronization;

public class SimpleClass1 implements Runnable {
	
	
		
  public static	boolean switcher;
  public static synchronized void methodSwitcher(boolean sw) {
	  
	  switcher = sw;
  }
	
	
	private String string1 = "Class 1 - String 1";
	private String string2 = "Class 1 - String 2";
	private String string3 = "Class 1 - String 3";

	public SimpleClass1() {

	}

	public SimpleClass1(String string1, String string2, String string3, int number1, int number2, int number3) {

		this.string1 = string1;
		this.string2 = string2;
		this.string3 = string3;

	}

	public void method1Class1() {

		System.out.println("Class 1 -  method 1");

	}

	public void method2Class1() {

		System.out.println("Class 1 -  method 2");

	}

	public void method3Class1() {

		System.out.println("Class 1 -  method 3");

	}

	@Override
	public void run() {
		
		try {
			
		
		if (!SimpleClass1.switcher) {

			System.out.println(Thread.currentThread().getName());
			SimpleClass1.switcher = true;
			
		}
		
		
		Thread.sleep(300);
		if (!SimpleClass1.switcher) {

			System.out.println(string1);
			SimpleClass1.switcher = true;
			
		}

		Thread.sleep(300);
		
		if (!SimpleClass1.switcher) {

			System.out.println(string2);
			SimpleClass1.switcher = true;
			
			
		}
		Thread.sleep(300);
	
		
		if (!SimpleClass1.switcher) {

			System.out.println(string3);
			SimpleClass1.switcher = true;
		
			
		}
		Thread.sleep(300);
		
		
		if (!SimpleClass1.switcher) {

			method1Class1();
			SimpleClass1.switcher = true;
			
		
		}
		
		Thread.sleep(300);
	
		
		if (!SimpleClass1.switcher) {

			method2Class1();
			SimpleClass1.switcher = true;
			
		}
		
		Thread.sleep(300);
		
		
		if (!SimpleClass1.switcher) {

			method3Class1();
			SimpleClass1.switcher = true;
		
			
		}
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
		
		

	}

	public String getString1() {
		return string1;
	}

	public void setString1(String string1) {
		this.string1 = string1;
	}

	public String getString2() {
		return string2;
	}

	public void setString2(String string2) {
		this.string2 = string2;
	}

	public String getString3() {
		return string3;
	}

	public void setString3(String string3) {
		this.string3 = string3;
	}

	@Override
	public String toString() {
		return "SimpleClass1 [string1=" + string1 + ", string2=" + string2 + ", string3=" + string3 + "]";
	}

}
