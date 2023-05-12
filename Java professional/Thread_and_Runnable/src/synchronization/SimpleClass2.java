package synchronization;

public class SimpleClass2 implements Runnable {

	private String string1 = "Class 2 - String 1";
	private String string2 = "Class 2 - String 2";
	private String string3 = "Class 2 - String 3";

	public SimpleClass2() {

	}

	public SimpleClass2(String string1, String string2, String string3, int number1, int number2, int number3) {

		this.string1 = string1;
		this.string2 = string2;
		this.string3 = string3;

	}

	public void method1Class2() {

		System.out.println("Class 2 -  method 1");

	}

	public void method2Class2() {

		System.out.println("Class 2 -  method 2");

	}

	public void method3Class2() {

		System.out.println("Class 2 -  method 3");

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
		return "SimpleClass2 [string1=" + string1 + ", string2=" + string2 + ", string3=" + string3 + "]";
	}

	@Override
	public void run() {

		try {
			
			Thread.sleep(300);
			if (SimpleClass1.switcher) {

				System.out.println(Thread.currentThread().getName());
				SimpleClass1.switcher = false;
				
			}
			
			Thread.sleep(300);
			
			
			if (SimpleClass1.switcher) {

				System.out.println(string1);
				SimpleClass1.switcher = false;
				
			}
			Thread.sleep(300);
			
		

			if (SimpleClass1.switcher) {

				System.out.println(string2);
				SimpleClass1.switcher = false;
				
			}
			
			Thread.sleep(300);
			
			
			if (SimpleClass1.switcher) {

				System.out.println(string3);
				SimpleClass1.switcher = false;
				
			}
			Thread.sleep(300);
			
				if (SimpleClass1.switcher) {

				method1Class2();
				SimpleClass1.switcher = false;
			
			}
				Thread.sleep(300);
			
			
			if (SimpleClass1.switcher) {

				method2Class2();
				SimpleClass1.switcher = false;
				
			}
		
			Thread.sleep(300);
			if (SimpleClass1.switcher) {

				method3Class2();
				

			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
