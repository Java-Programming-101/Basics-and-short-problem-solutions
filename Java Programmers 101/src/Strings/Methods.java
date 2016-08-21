package Strings;

public class Methods {

	public static void main(String[] args) {
		/*
		 * the methods available to the string class that are commonly used are.
		 */
		
		String str= "I am a string! ";
		
		// sub-string 
		
		System.out.println(str.substring(7));
		
		// char-at ---- If there is a character next to the one specified they will all be returned up to the next whitespace.
		
		System.out.println(str.charAt(str.length()-1));
	
	}

}
