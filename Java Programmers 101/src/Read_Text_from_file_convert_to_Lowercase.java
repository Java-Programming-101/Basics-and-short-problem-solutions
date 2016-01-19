import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Read_Text_from_file_convert_to_Lowercase {

	public static void main(String[] args) {
		// This programme will take a file as an input and convert the contents to lower case.
		
		try {
	        File file = new File("C:\\Users\\Marc\\git\\Basics-and-short-problem-solutions\\Java Programmers 101\\src\\Test Text File.txt");
	        BufferedReader in = new BufferedReader(new FileReader(file));
	        String line;
			while (( line = in.readLine()) != null) {
						System.out.println(line.toLowerCase());	
	        }
			in.close();
	    } catch (IOException e) {
	        System.out.println("File Read Error: " + e.getMessage());
	    }  
		
	}

	}


