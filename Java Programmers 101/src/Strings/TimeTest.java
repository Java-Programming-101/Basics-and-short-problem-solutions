package Strings;

public class TimeTest {

	public static void main(String[] args) {
		
		/*
		 * Time test to amend a string
		 */
		long start = System.currentTimeMillis();
		String string = " ";
		for (int i = 0 ; i < 10_000; i++){
			string += ", ";
		}
		
		
		long end = System.currentTimeMillis();
		
		System.out.println("It took "+ (end-start) +" Milliseconds to complete the String opperation.");

		
		/*
		 * Time test to amend a StringBuffer.
		 */
		start = System.currentTimeMillis();
		StringBuffer sBuffer = new StringBuffer(" ");
		
		for (int i = 0 ; i < 1_000_000; i++){
			sBuffer.append(", ");
		}
		end = System.currentTimeMillis();
		System.out.println("It took "+ (end-start) +" Milliseconds to complete the Stringbuffer opperation.");

		
		/*
		 * Time test to amend a String Builder.
		 */
		
		start = System.currentTimeMillis();
		StringBuilder sBuilder = new StringBuilder(" ");
		
		for (int i = 0 ; i < 1_000_000; i++){
			sBuilder.append(", ");
		}
		
		end = System.currentTimeMillis();
		System.out.println("It took "+ (end-start) +" Milliseconds to complete the StringBuilder opperation.");
		
	
		
		

		
	}

}
