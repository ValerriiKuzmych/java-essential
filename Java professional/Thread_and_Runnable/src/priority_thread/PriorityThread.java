package priority_thread;

public class PriorityThread {
	
	public static void main(String[] args) {
		
		PriorityRunner runner = new PriorityRunner();
		
		Thread minPriority = new Thread(runner, "MIN PRIORYTY");
		Thread normPriority = new Thread(runner, "NORM PRIORYTY");
		Thread maxPriority = new Thread(runner, "MAX PRIORYTY");
		
		minPriority.setPriority(Thread.MIN_PRIORITY);
		normPriority.setPriority(Thread.NORM_PRIORITY);
		maxPriority.setPriority(Thread.MAX_PRIORITY);
		
		minPriority.start();
		normPriority.start();
		maxPriority.start();
		
	}

}
