package multiThreading_Example2_Demo_Extending_Thread;

public class Count extends Thread{
	
	public Count() {
	     System.out.println("Count thread created " + this);
	     start();
	}
	
	@Override
	public void run(){ 
		try
	     {
	        for (int i=0 ;i<10;i++)
	        {
	           System.out.println("Printing the count " + i);
	           Thread.sleep(1000); // put the tread to sleep for 1000 milliseconds (1 second)
	        }
	     }
	     catch(InterruptedException e)
	     {
	        System.out.println("my thread interrupted");
	     }
	     System.out.println("My thread run is over" );
	   }
	}


