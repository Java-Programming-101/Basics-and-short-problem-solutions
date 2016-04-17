package multiThreading_Example2_Demo_Extending_Thread;

public class Main {

	public static void main(String[] args) {
		Count cnt = new Count(); // creates a new count object, start is implemented in the count() constructor.
	      try
	      {
	         while(cnt.isAlive()) // While the Thread created in cnt is alive(running)
	         {
	           System.out.println("Main thread will be alive till the child thread is live");
	           Thread.sleep(1500);
	         }
	      }
	      catch(InterruptedException e)
	      {
	        System.out.println("Main thread interrupted");
	      }
	      System.out.println("Main thread's run is over" );

	}

}
