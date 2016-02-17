import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Nth_Fibonacci {

	public static void main(String[] args) {
		try {
	        File file = new File("C:\\Users\\Marc\\git\\Basics-and-short-problem-solutions\\Java Programmers 101\\src\\numbers_test.txt");
	        BufferedReader in = new BufferedReader(new FileReader(file));
	        String nthNum;
			while (( nthNum = in.readLine()) != null) {
				int prev1 = 0;
				int prev2 = 1;
				for (int i = 0; i < Integer.parseInt(nthNum); i++) {
					int save = prev1;
					prev1 = prev2;
					prev2 = save+prev2;
				}	
				System.out.println(prev1);
	        }
			in.close();
	    } catch (IOException e) {
	        System.out.println("File Read Error: " + e.getMessage());
	    }

	}

}
