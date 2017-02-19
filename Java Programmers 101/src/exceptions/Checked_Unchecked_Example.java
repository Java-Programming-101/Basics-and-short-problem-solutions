package exceptions;

import java.io.FileInputStream;


public class Checked_Unchecked_Example {

	public static void main(String[] args) {
		
		new UncheckedExample();

	}

}


class CheckedExample {  
/*
 * Lets understand this with this example: In this example we are reading the file test text file.txt 
 * and displaying its content on the screen. In this program there are three places where a
 * checked exception is thrown as mentioned below. 
 * 
 * FileInputStream which is used for specifying the file path and name, throws FileNotFoundException. 
 * 
 * The read() method which reads the file content throws IOException and 
 * 
 * the close() method which closes the file input stream also throws IOException.
 * 
 * How can we deal with these exceptions? (there are two ways)
 */
	
	public void runChecked(){
	      FileInputStream fis = null;
	      try{
	      fis = new FileInputStream("C:\\Users\\Marc\\git\\Basics-and-short-problem-solutions\\Java Programmers 101\\src\\Test Text File.txt");
	      int k; 

	      while(( k = fis.read() ) != -1) 
	      { 
		   System.out.print((char)k); 
	      } 
	      fis.close(); 	
	   }catch(Exception e){
		   
	   }
}

class UncheckedExample {
	/*
	 * In this example you will notice that there are no compile errors.... Why is that? 
	 * It means if your program is throwing an unchecked exception and even if you didn’t 
	 * handle/declare that exception, the program won’t give a compilation error. 
	 * 
	 * Most of the times these exception occurs due to the bad data provided by user during 
	 * the user-program interaction. It is up to the programmer to judge the conditions in advance, 
	 * that can cause such exceptions and handle them appropriately. 
	 * 
	 * All Unchecked exceptions are direct sub classes of RuntimeException class.
	 */
	public void runUnchecked() {
		int i = 10;
		int x = 0;
		
		System.out.println(i/x);
		
		
	}
}