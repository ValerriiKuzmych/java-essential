package three_threads;



public class SimpleClass implements Runnable  {
	
	
	public static boolean firstDone;
	public static boolean secondDone;

	public static void main(String[] args) {

		
        Thread main = Thread.currentThread();
		Thread first = new Thread(new SimpleClass(), "First thread");
		Thread second = new Thread(new SimpleClass(),"Socond thread");
		
		
       
		first.start();
		second.start();
		
		System.out.println( "First Thread: " + first.isAlive());
		System.out.println( "Second Thread: " + second.isAlive());
		
		System.out.println(main.getState());
		System.out.println(first.getState());
		System.out.println(second.getState());
		
		
		System.out.println( "First Thread: " + first.isAlive());
		System.out.println( "Second Thread: " + second.isAlive());

		System.out.println( "Main Thread: " + main.isAlive());
		
		if(!first.isAlive() && !second.isAlive()) {
			
			System.out.println("finish");
		
		}

	}
	
	@Override
	public void run() {
		
		
		
		
	
		
          
	}

	


}
