package multiThreading_Example3_Demo_ImplimentingRunnable;

public class Counter extends Thread {

	private static int count;
	
	private void increment() {
		count++;
	}
	
	public void run() {
		for (int i = 0; i < 100_000; i++) {
			increment();
		}
	}
	
	public static void main(String[] args) throws Exception {
		Counter c = new Counter();
		c.start();
		Counter c2 = new Counter();
		c2.start();
		
		 
				
				
		c2.join();
		c.join();
		
		System.out.println(c.count);
		System.out.println(c2.count);
	}
	
}
