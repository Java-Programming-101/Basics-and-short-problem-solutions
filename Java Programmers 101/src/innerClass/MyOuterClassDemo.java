package innerClass;


//Top level class definition
public class MyOuterClassDemo {
	
	int myVar = 1;
	
	// inner class definition
	class MyInnerClassDemo {
		
		public void seeOuter () {
	         System.out.println("Value of myVar is :" + myVar);
	    }
	
	}//Close innerclass definition.
}// Close Outerclass definition. 

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
