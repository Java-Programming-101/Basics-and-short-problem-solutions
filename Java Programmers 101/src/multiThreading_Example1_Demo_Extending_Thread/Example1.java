package multiThreading_Example1_Demo_Extending_Thread;

public class Example1 extends Thread { // extend the Thread class. 
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Thread#run()
	 * 
	 * I like to think of the run method as similar to the main method. This is where your code should go to 
	 * define what you wan to happen in this thread. Without overriding the run() method your thread wont 
	 * have any implementation and wont do anything. 
	 * 
	 */
	
	@Override
	public void run(){
		System.out.println("My thread is in a running state.");
	}
	

	public static void main(String[] args) {
		Example1 obj = new Example1(); // create an instance of the Example 1 class.
		
		obj.start(); // Start the thread. 

	}

}
