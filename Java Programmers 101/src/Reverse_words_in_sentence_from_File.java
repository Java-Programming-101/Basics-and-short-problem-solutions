import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Reverse_words_in_sentence_from_File {

	public static void main(String[] args) {
		try {
	        File file = new File("C:\\Users\\Marc\\git\\Basics-and-short-problem-solutions\\Java Programmers 101\\src\\Test Text File.txt");
	        BufferedReader in = new BufferedReader(new FileReader(file));
	        String line;
	        
			while (( line = in.readLine()) != null) {
						String[] words = line.split(" ");
						
						
						for (int i = words.length ; i>0; i-- ){
							if(i == 0){
								words[0]= words[0].trim();
								System.out.println(words[i-1]);
							}else{
								System.out.print(words[i-1]);
							}
						}
							
			}
			in.close();
	    } catch (IOException e) {
	        System.out.println("File Read Error: " + e.getMessage());
	    }  

	}

}
