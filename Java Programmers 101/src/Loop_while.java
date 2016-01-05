import java.util.Random;

public class Loop_while {

	public static void main(String[] args) {
		// generate a number between 1 and 20 and only stop if the number generated is a 10.
		Random random = new Random(); 
		
		int i = 0;
		// initialize i to 0 to enter the while loop.
		
		while (i != 10) { 
		// while i is not equal to 10
			i = random.nextInt(20);
			// generate a random intager with a maximum value of 20.
			System.out.println(i);
		}

	}

}
