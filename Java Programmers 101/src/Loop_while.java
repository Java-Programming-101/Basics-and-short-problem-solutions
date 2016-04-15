import java.util.Random;

public class Loop_while {

	public static void main(String[] args) {
		/* generate a number between 1 and 200 and only stop if the number generated is a 10.
		 * 
		 * a while loop will check a condition is true and continue to run that loop until the condition is false. 
		 * 
		 * the syntax is : 
		 * 
		 * 	while (someCondition is true) {
		 * 		do some stuff
		 *  }
		 */
		
		
		
		
		Random random = new Random(); 
		int i = 0;
	
		// Initialise i to 0 to enter the while loop.			
			
					
				while (i != 10) { 
					// while i is not equal to 10
					System.out.println("Im in the inner loop");
					i = random.nextInt(200);
					// generate a random integer with a maximum value of 200.
					System.out.println(i);
				}
			
		

	}

}
