package multiThreading_Example4_Demo_ImplimentingRunnable;

public class Main {

	public static void main(String[] args) {
		Count count = new Count(); // Create a new instance of Count
		try{
			while(count.myThread.isAlive()){ // Check the 
				System.out.println("Main Thread will be alive until the child thread is complete.");
				Thread.sleep(1500);
			}
		}catch (InterruptedException e) {
					System.out.println("Main thread interupted.");
		}

	}

}
