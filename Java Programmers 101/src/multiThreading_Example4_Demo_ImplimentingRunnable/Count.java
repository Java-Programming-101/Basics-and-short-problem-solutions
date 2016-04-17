package multiThreading_Example4_Demo_ImplimentingRunnable;

public class Count implements Runnable {
	
	Thread myThread;
	
	public Count() {
		myThread = new Thread(this); // create a new Thread 
		System.out.println("Count thread created " );
		myThread.start(); // Start the thread.
	}
	
	@Override //override the run method.
	public void run(){
		
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("The Count is " + i);
				Thread.sleep(1000); // make the thread sleep for 1 second 
				}
		}catch (InterruptedException e) {
					System.out.println("Count Thread interupted.");
				}
		}
				
		}
	


