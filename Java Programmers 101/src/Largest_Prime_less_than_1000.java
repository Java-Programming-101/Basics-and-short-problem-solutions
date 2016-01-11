import java.util.Arrays;

public class Largest_Prime_less_than_1000 {
	
	public static void main(String[] args) {
		//In this program we will attempt to find the largest prime number that is less than 1000.
		
		boolean[] numbers = new boolean[10000];// create an array to determine what the prime numbers are.
		Arrays.fill(numbers, true);// assume all the numbers are prime to begin with.
		int LargestPrime = 0;
		
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
    			if (i > LargestPrime && i < 1000){
    				LargestPrime = i;
    			}
    			
	   		}
		}
	System.out.print(LargestPrime);

	}
}
