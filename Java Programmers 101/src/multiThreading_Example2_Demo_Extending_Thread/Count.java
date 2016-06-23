package multiThreading_Example2_Demo_Extending_Thread;

public class Count extends Thread {
	
	public Count() {
	     System.out.println("Count thread created ");
	    
	     start();
	}
	
	@Override
	public void run(){ 

	        for (int i=0 ;i<10;i++){
	           System.out.println("Printing the count ");
	        }
	  
	     System.out.println("My thread run is over" );
	   }
	}


