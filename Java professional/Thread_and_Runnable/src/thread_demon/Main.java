package thread_demon;

public class Main {
	
	public static void main(String[] args) {
		
	
		
		Thread deamon = new Thread("Deamon Thread");
		
		deamon.setDaemon(true);
		
		
 System.out.println("Stack trace " + deamon.getStackTrace());
 System.out.println("Priority " + deamon.getPriority());
 System.out.println("Class loader " + deamon.getContextClassLoader());
 System.out.println("Id " + deamon.threadId());
 System.out.println("String " + deamon.toString());
 System.out.println("Exception Handler " + deamon.getUncaughtExceptionHandler());
 System.out.println("State " +  deamon.getState());
 System.out.println("Alive " + deamon.isAlive());
 System.out.println("Is deamon " + deamon.isDaemon());
 System.out.println("Is Interrupted " + deamon.isInterrupted());

 
 
}
}
