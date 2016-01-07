import java.util.ArrayList;
import java.util.Arrays;

public class Sum_of_first_1000_Prime_Numbers {

	public static void main(String[] args) {
		//In this program we will attempt to find the first 1000 prime numbers and calculate the Sum of them. 
		
		ArrayList<Integer> primes = new ArrayList<Integer>();	//create an array list to store the prime numbers when we have found them.
		boolean[] numbers = new boolean[10000];// create an array to determine what the prime numbers are.
		Arrays.fill(numbers, true);// assume all the numbers are prime to begin with.
		int total = 0;// initilize a way to record the sum of the prime numbers.
		
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
    			primes.add(i);
	   		}
		}
	
    
    	if (primes.size()>= 1000){
    		// add the first 1000 primes of the list together
    		for (int i=0; i < 1000; i++){
    			total=total+ primes.get(i);
    		}
    	}else {
    			System.out.print("There are not 1000 primes in the primes array list.");
			}

   
   		System.out.print(total);

	}
}
