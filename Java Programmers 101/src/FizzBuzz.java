import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FizzBuzz {

	public static void main(String[] args) {
		try {
			
			File file = new File("C:\\Users\\Marc\\git\\Basics-and-short-problem-solutions\\Java Programmers 101\\src\\fizzBuzz.txt");
			BufferedReader in = new BufferedReader(new FileReader(file));
			String line[];
			String lineS;
			
			while ((lineS = in.readLine())!=null){
				line = lineS.split(" ");
				int firstDiv = Integer.parseInt(line[0]);
				int secondDiv = Integer.parseInt(line[1]);
				int n = Integer.parseInt(line[2]);
				
				for(int iteration = 1; iteration <= n ; iteration++){
					if (iteration % firstDiv == 0 && iteration % secondDiv == 0 ) {
						System.out.print("FB ");
					}else if (iteration % firstDiv == 0 ){
						System.out.print("F ");
					}else if (iteration % secondDiv == 0) {
						System.out.print("B ");
					}else {
						System.out.print(iteration + " ");
					}
			
					}
				System.out.println();
				}
				
			} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
