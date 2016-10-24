package AnonInnerClasses;

public class Main {

	
	/*
	 * use the following syntax to declare and instantiate an anonymous class:
	 * 
	 * new interface-or-class-name() { class-body }
	 */
	public static void main(String[] args) {
	 
		Myclass myClass = new Myclass();
		
		myClass.displayMessage(new Message() {
			
			public String greeting() {
				return "Hello, i am an anonymous inner class";
			}
		});// Note where the semi-colon goes !!!
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		new Runnable() {
			
			@Override
			public void run() {
				System.out.println("I'm also an anonymous inner class!");
				
			}
		};
		
		
	}

}



