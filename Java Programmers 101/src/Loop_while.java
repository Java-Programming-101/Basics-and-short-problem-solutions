import java.util.Random;

public class Loop_while {

	public static void main(String[] args) {
		// generate a number between 1 and 20 and only stop if the number generated is a 10.
		
		
		
		
		Random random = new Random(); 
		int i = 0;
	
		// Initialise i to 0 to enter the while loop.
		out:
			while (i !=11){
				
				inner:
					
				while (i != 10) { 
					System.out.println("Im in the inner loop");
					// while i is not equal to 10
					i = random.nextInt(200);
					// generate a random integer with a maximum value of 200.
					System.out.println(i);
				break out;
				}
			}

	}

}
