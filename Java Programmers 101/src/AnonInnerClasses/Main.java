package AnonInnerClasses;

public class Main {

	public static void main(String[] args) {
	 
		Myclass myClass = new Myclass();
		
		myClass.displayMessage(new Message() {
			
			@Override
			public String greeting() {
				return "Hello, i am an anonymous inner class";
			}
		});

	}

}



