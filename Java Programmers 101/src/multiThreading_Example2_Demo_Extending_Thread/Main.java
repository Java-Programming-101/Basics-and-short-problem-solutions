package multiThreading_Example2_Demo_Extending_Thread;

public class Main {

	public static void main(String[] args) throws Exception {
		Count cnt = new Count(); // creates a new count object, start is implemented in the count() constructor.
		
	     while(cnt.isAlive()) // While the Thread created in cnt is alive(running)
	     {
	        System.out.println("Main thread will be alive till the child thread is live");
	        Thread.sleep(1500); // sleep for 1.5 seconds 
	     }

	      System.out.println("Main thread's run is over" );

	}

}
