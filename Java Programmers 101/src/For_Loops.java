

public class For_Loops {

	public static void main(String[] args) {
		
	    /*
	     * for loops are excellent tools for reducing the amount of code you need to write to perform the same 
	     * task multiple times. 
	     */
		
		/*
		 * the basic syntax for a 'for' loop is 
		 * 
		 * for (some amount of times){
		 *     do something
		 *     }
		 *     
		 * There are a couple of different for loops that you should be aware of. 
		 */
		
		/*
		 * the first is below the syntax for this is 
		 * for (a starting number; while some condition; modify the starting number) {
		 *     do something 
		 *     }
		 *  
		 * Now you have to be aware that an incorrect condition or an incorrect increment could cause the loop to run forever.
		 * for example -  for(int myStart = 0 ; myStart < 10 ; myStart--)
		 * this example will run forever because myStart begins at 0, we check to see if it is less than 10, it is so we doSomething,
		 * then we decrement myStart by 1. This means that myStart will be -1 so is still less than 10. 
		 *  
		 */
		for (int myNumber = 0; myNumber < 10; myNumber++ ){
			System.out.println("I have been in the for loop "+ (myNumber+1) + " times.");
		}
		// comment everything out below to see the standard for loop in action by its self. 
		
		
		//enhanced for loop.
		int [] myArray = {1,6,8,4,7,2,5,3,9,10};
		int totalOfMyArray=0;
		
		/*
		 * The Enhanced for loop is a good choice when you have an array of objects and you know you
		 * want to traverse them all
		 * the syntax for a an enhanced for loop (also known as a for each loop) is as follow 
		 * for (type of object in the array : in this Array){
		 *     do something 
		 *     }
		 *
		 * Note the change in symbol in the condition
		 */
		
		for ( int elemment: myArray){
			totalOfMyArray = totalOfMyArray + elemment;
		}
		
		System.out.println("The total of myArray = " + totalOfMyArray);
		for (int element : myArray){
			System.out.println(element);
		}
		
	}

}
