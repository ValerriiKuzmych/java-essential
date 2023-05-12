package synchronization;

public class Main {
	
	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName());

		Thread thread1 = new Thread(new SimpleClass1());
		Thread thread2 = new Thread(new SimpleClass2());

		thread1.start();
		thread2.start();
		
		
		System.out.println(thread1.getState());
		System.out.println(thread2.getState());
	}

}
