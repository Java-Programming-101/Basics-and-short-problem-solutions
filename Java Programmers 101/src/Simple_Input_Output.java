

import java.util.Scanner;

public class Simple_Input_Output {
	
	/*
	 * This Short programme demonstrates how you can read the input from a user and repeat the information back to them.
	 */


	public static void main(String[] args) {
		
		// reads the input from the Keyboard
		Scanner keyboard_Scanner = new Scanner(System.in);
		
		// stores the input for use later.
		String keyboardInput = keyboard_Scanner.next();
		
		// Prints out the contents of what the use typed.
		System.out.print(keyboardInput);
		
		// Closes the Keyboard Scanner. 
		keyboard_Scanner.close();
	}

}
