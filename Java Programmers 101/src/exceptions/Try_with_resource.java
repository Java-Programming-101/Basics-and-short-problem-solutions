package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Try_with_resource {

	public static void main(String[] args) {

// without the try-with-resource statement
		
		FileInputStream flinst = null;
		try {
			flinst = new FileInputStream("C:\\Users\\Marc\\git\\Basics-and-short-problem-solutions\\Java Programmers 101\\src\\Test Text File.txt");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		try{	      
			int v; 
			while(( v = flinst.read() ) != -1) 
			{ 
				System.out.print((char)v); 
			}
	      }catch(Exception e2){
	    	  e2.printStackTrace();
	      }finally {
	    	  try{
	    		  if(flinst!= null){
	    			  flinst.close();
	    		  }
	    	  }catch(Exception e){
	    		  e.printStackTrace();
	    	  }
	      }
	
	/*
	 * The try with resource helps clean up your code to read clearer while also ensuring that regardless of whether the
	 * recourse completes its use or is terminated abruply it is ALWAYS automatically shut down and the rescourse is closed. 
	 */
	      
	      
	      
	      	
		
		
		
		
		
		
		// with try with resource 
		
		
		 try(
		    FileInputStream fis = new FileInputStream("C:\\Users\\Marc\\git\\Basics-and-short-problem-solutions\\Java Programmers 101\\src\\Test Text File.txt");
		    ){		      
		      int k; 

		      while(( k = fis.read() ) != -1) 
		      { 
		    	  System.out.print((char)k); 
		      } 
	      } catch (FileNotFoundException e) {
			e.printStackTrace();
	      } catch (Exception e) {
			e.printStackTrace();
	      }
	}
}
