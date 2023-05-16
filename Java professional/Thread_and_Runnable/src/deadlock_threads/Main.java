package deadlock_threads;

public class Main {

	public static void main(String[] args) {

		SimpleThreadOne classOne = new SimpleThreadOne();
		SimpleThreadTwo classTwo = new SimpleThreadTwo();

		classOne.setThread1(classTwo);
		classTwo.setThread2(classOne);
		
		classOne.start();

		try {

			Thread.sleep(500);	
			
		}

		catch (InterruptedException e) {

			e.printStackTrace();
		}
		
		classTwo.start();
		
	}

}

class SimpleThreadOne extends Thread {

	private Thread thread1;

	public SimpleThreadOne() {
		System.out.println("SimpleThreadOne create");
	}

	public Thread getThread1() {
		return thread1;
	}

	public void setThread1(Thread thread1) {
		this.thread1 = thread1;
	}

	@Override
	public void run() {

		System.out.println("SimpleThreadOne start");

		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
//		 TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("SimpleThreadOne interrupt SimpleThreadTwo finish ");

		try {

			thread1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("SimpleThreadOne finished");

	}

}

class SimpleThreadTwo extends Thread {

	private Thread thread2;

	public SimpleThreadTwo() {
		System.out.println("SimpleThreadTwo create");
	}

	public Thread getThread2() {
		return thread2;
	}

	public void setThread2(Thread thread2) {
		this.thread2 = thread2;
	}

	@Override
	public void run() {

		System.out.println("SimpleThreadTwo start");
		System.out.println("SimpleThreadTwo interrupt SimpleThreadOne finish ");

		try {
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("SimpleThreadTwo finished");

	}

}
