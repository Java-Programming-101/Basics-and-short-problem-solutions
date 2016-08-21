
public class Strings {

	public static void main(String[] args) {
		
		String greeting1 = "Hello ";
		String greeting2 = "world";
		
		//What happens when you add these two strings together?
		
		p(greeting1+greeting2);

		//What is happening to the string in the memory?
		
		//If we then assign a new value to greeting1
		
		greeting1 = "Goodbye ";
		
		// what is the outcome of adding greeting1 and greeting 2 together?
		// Did we change the original greeting1 from Hello to Goodbye? What's happening in the memory to this?
		
		greeting1.length()

	}
	public static void p (String print){
		System.out.println(print);
	}

}
