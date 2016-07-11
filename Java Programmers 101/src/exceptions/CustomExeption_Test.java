package exceptions;

public class CustomExeption_Test {
	
/*
 * In the method textexception we pass in a String as an argument,
 * check to see if the string is null,
 * throw a new custom exception.	
 */
	public static void textException (String string) throws CustomExeption{
		if(string == null ){
			throw new CustomExeption(" The String value is null");
		}
	}
	
	
	public static void main(String args[]) {
		
		try{
			textException(null);
		}
		catch(CustomExeption e){
			e.printStackTrace();
		}
	}
	
	


}
