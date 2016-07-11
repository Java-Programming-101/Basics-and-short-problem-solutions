import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class nth_to_last_Element {
	
	/*
	 * The goal of this test is to take a file with lines of letters and a number
	 * and using that number count from the end of the line to the front and print
	 * the letter at that location 
	 * 
	 * e.g 
	 * input:
	 * 		a b c d 4
	 * 		e f g h 2
	 * 
	 * output:
	 * 
	 * a
	 * g
	 */

	public static void main(String[] args) {
		
		
		try {
			
			File file = new File("C:\\Users\\Marc\\git\\Basics-and-short-problem-solutions\\Java Programmers 101\\src\\nth to last eelemennt test.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line;
			
			
			while ((line = reader.readLine()) != null) {
				String arr [] = line.split(" ");				
				int mth = Integer.parseInt(arr[arr.length-1]);
				if (mth > arr.length || mth == 0) {
					
				}else {
					System.out.println(arr[arr.length-mth-1]);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
