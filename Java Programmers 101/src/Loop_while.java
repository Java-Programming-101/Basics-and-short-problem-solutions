import java.util.Random;

public class Loop_while {

	public static void main(String[] args) {
		// generate a number between 1 and 20 and only stop if the number generated is a 10.
		Random random = new Random();
		int i = 0;
		while (i != 10) {
			i = random.nextInt(20);
			System.out.println(i);
		}

	}

}
