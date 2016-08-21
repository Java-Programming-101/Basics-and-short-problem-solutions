package innerClass;

public class CreatingInnerFromOuterClass {
	
	int number = 1;

	// Method to create an instance of the inner class. 
	public void createInner(){
		innerClass inner = new innerClass();
		
		inner.lookingOut();
	}
	
	
	// innerclass 
	class innerClass{
		
		// method to show that the inner class has access to the members of the outerclass.
		void lookingOut(){
			System.out.println("When i look in the outerclass i can see the number "+number);
		}
	}
}


/*
 * Inner class acts as a member of the enclosing class and can have 
 * any access modifiers: abstract, final, public, protected, private, static.
 * 
 * Inner class can access all members of the outer class including those marked 
 * private as shown in the above example 
 * 
 * where the inner class is accessing the private variable "myVar" of outer class
 * 
 * 
 */

