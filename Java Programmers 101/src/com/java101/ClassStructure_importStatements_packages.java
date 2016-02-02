package com.java101; // packages are always imported first.
import java.util.Scanner; // followed by import statements. 

public class ClassStructure_importStatements_packages {//followed by the class.

	public static void main(String[] args) {
		/*
		 * packages help in a couple of ways,
		 * 1) group useful classes together
		 * 2) helps prevent name collisions.
		 * ***************(any others? feel free to add them here)***************
		 *  
		 * 
		 * import statements help reduce the amount of typing you do by allowing you to just use
		 * the class name rather than having to use the package name. 
		 * 
		 * 
		 * for example, presume you wish to write a program that echos what a user types on
		 * the keyboard. 
		 * 
		 * you first need to set up an object to listen to what the input is from the keyboard. 
		 * 
		 * The class that we need is called a scanner and this lives in the package java.util and
		 * can be set up like...
		 */
		java.util.Scanner lotsOfTyping = new java.util.Scanner(System.in);
		
		/*
		 * As you can see, if you needed to do this more than once it will create alot more work.
		 */
		
		/*
		 * Now you may have noticed at the top, the statement import java.util.Scanner;
		 * This now allows you to call the Scanner class just by using the class name. As shown below.
		 */
		Scanner in = new Scanner(System.in);
		
		/*
		 * You have to use System.out.println quite a bit, are there any ways to shorten this route?
		 * is it a good idea to do so?
		 */

	}

}
