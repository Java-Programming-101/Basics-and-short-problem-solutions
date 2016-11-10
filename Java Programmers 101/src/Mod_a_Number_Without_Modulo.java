import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Mod_a_Number_Without_Modulo {

	public int findMod(int a, int b){
	    int mod = a - (a/b)*b;
		return mod;
	}
	
	
	public static void main(String[] args) {
		Mod_a_Number_Without_Modulo mod_a_Number_Without_Modulo = new Mod_a_Number_Without_Modulo();
		try {
			File file = new File("C:\\Users\\Marc\\git\\Basics-and-short-problem-solutions\\Java Programmers 101\\src\\modtest.txt");
			BufferedReader in = new BufferedReader(new FileReader(file));
			
			String number;
			while ((number = in.readLine()) != null) {
				String[] modNumbers;
				modNumbers = number.split(",");
				int mod = mod_a_Number_Without_Modulo.findMod(Integer.parseInt(modNumbers[0]),Integer.parseInt(modNumbers[1]));
				System.out.println(mod);
			}
		} catch (Exception e) {
			System.out.print("no file found");
		}
			
		}
		
	}


