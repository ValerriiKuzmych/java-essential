package priority_thread;

public class PriorityRunner implements Runnable {
	

	@Override
	public void run() {
		
		for(int i = 1; i <= 50; i++ ) {
			
			System.out.println(Thread.currentThread().getName() +" "+ i);
		
		
	}
	}

}
