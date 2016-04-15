import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Add_numbers_from_file {
	
	// To be discussed in a later Meetup.

	public static void main(String[] args) {
		try {
			File file = new File("C:\\Users\\Marc\\git\\Basics-and-short-problem-solutions\\Java Programmers 101\\src\\numbers_test.txt");
			BufferedReader in = new BufferedReader(new FileReader(file));
			int total = 0;
			String number;
			while ((number = in.readLine()) != null) {
				total = total + Integer.parseInt(number);
			}
			System.out.println(total);
		} catch (Exception e) {
			System.out.print("no file found");
		}

	}

}
