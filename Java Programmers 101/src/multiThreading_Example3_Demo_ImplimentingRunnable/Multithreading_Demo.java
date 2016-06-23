package multiThreading_Example3_Demo_ImplimentingRunnable;

public class Multithreading_Demo implements Runnable {
	
	@Override
	public void run() {
		System.out.println("In my running state.");
	}


	public static void main(String[] args) {
		
		Multithreading_Demo obj = new Multithreading_Demo(); // create an instance of the multithreading_demo class
		
		Thread threadObject = new Thread(obj);// create an instance of the Thread class passing the (obj) object to the constructor.
		
		threadObject.start();// calling start on ThreadObject to start the Thread. 
		

	}

}
