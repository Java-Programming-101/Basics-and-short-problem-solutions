package exceptions;

public class CustomExeption extends Exception{

	/**
	 * The exception class need to have a serialVersionUID ... why?
	 */
	private static final long serialVersionUID = 1L;
	
	public CustomExeption() {	
		
	}
	
	public CustomExeption(String message){
		super(message);
	}
	public CustomExeption (Throwable cause) {
		super(cause);
	}
	
	public CustomExeption (String message , Throwable cause){
		super(message,cause);
	}
	
	public CustomExeption (String message , Throwable cause, boolean enableSuppression, boolean writableStackTrace){
		super(message,cause,enableSuppression,writableStackTrace);
	}	
	

}
