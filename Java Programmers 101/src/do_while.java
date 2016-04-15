
public class do_while {

	public static void main(String[] args) {
	
	int myNumber = 0;
		/*
		 * A do-while loop will always execute a block of code once! this is because the condition
		 * to check if the block should be run again is only checked at the end of the first run.
		 */
	do {
		if(myNumber==0){
			System.out.println("I will always be exicuted at least once!");
		}
		
		System.out.println("So far i have been exicuted "+ ++myNumber +" times.");
		
		
	} while (myNumber < 1);
	
	/*
	 * A while loop will check the condition passed to it is true before executing the block of code 
	 * attached to it. 
	 */
	
	while (myNumber<1){
//  while (some condition is true){		
		System.out.println("I will not be entered if ");
//      do this stuff.}		
	}
	
	
	}



}
