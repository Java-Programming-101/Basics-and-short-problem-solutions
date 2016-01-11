import java.util.Arrays;

public class Largest_Prime_Pallendrome_Less_Than_1000 {

	public static void main(String[] args) {
		//In this program we will attempt to find the largest prime palindrome that is less than 1000.
		
		boolean[] numbers = new boolean[10000];// create an array to determine what the prime numbers are.
		Arrays.fill(numbers, true);// assume all the numbers are prime to begin with.
		int largestPrimePallendrome = 0;// Declare a variable to store the largest prime palindrome.
		
		numbers[0]=numbers[1]=false;       // we know 0 and 1 are not prime.
    	
		for (int i=2;i<numbers.length;i++) {
        	//if the number is prime, 
        	//then go through all its multiples and make their values false in the numbers array.
        	if(numbers[i]) {
            	for (int j=2;i*j<numbers.length;j++) {
                	numbers[i*j]=false;
            	}  	
        	}
    	}
    
    	// add all of the prime numbers found in the numbers array to the primes array list.
    	for (int i=0 ; i < numbers.length ; i++){
    		if (numbers[i] == true){
    			
    			//Check to see if this prime number is the largest prime less than 1000
    			if (i > largestPrimePallendrome && i < 1000){
    				int reverse=0; //to store the prime number in reverse.
    				int pal = i;   //initialise pal to allow changes to i.
    				 
    				while (pal != 0) {
    					int remainder = pal % 10; // get the last digit of the number.
    				    reverse = reverse * 10 + remainder; // arrange the digits in reverse order.
    				    pal = pal / 10; // reduce the value of pal by x10  
    				}
    				if (i == reverse){ // check if this prime is a palindrome. 
    					largestPrimePallendrome = i; // update the variable we declared to store palindrome's
    				}
    			}
    			
	   		}
		}
    	

	System.out.print(largestPrimePallendrome);

	}    	
	
	
		

    
}
