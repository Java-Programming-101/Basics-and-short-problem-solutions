package static_Nested_Classes;

public class Static_Nested_InnerClass_Demo {

	String outer = "Outer";
	
	static class inner{
		void hello(){
			System.out.println("Hello from the inner class.");
		}
		
/*
 * A static nested class is the inner class marked with static modifier.
 * Because it is static in nature this type of inner class doesn’t share 
 * any special kind of relationship with an instance of outer class.
 * 
 * A static nested class cannot access non static members of outer class.		
 */
	}
}


