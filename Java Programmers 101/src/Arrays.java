

public class Arrays {
	int[] myNextArray;
	public void ArrayInitilizeation() {
	    //to declare an array you need to state what TYPE of array it is followed by [],
		//then give a meaningful name.
		
		// declaring an array. = initilizing and array. -
		int[] ANumberArray = new int [10];

		//Another array way.
		
	
		//Notice that the [] are empty. this is because the size of an array is not part of its type. 
		myNextArray.toString();
		myNextArray = new int[10];
		myNextArray.toString();
		
		
		
		//Declaring another array of Ints using a shortcut syntax!
		int[] yetAnotherArray = {3,5,9,6,2};
		

		//		You can also place the brackets after the array's name, this form is discouraged
		int anAcceptableButBadArray [] ;

		
	}
	
	
	
	
	
	
	 public static void main(String[] args) {
	        // declares an array of integers
	        int[] anArray;

	        // allocates memory for 10 integers
	        anArray = new int[10];
	           
	        // initialize first element
	        anArray[0] = 100;
	        // initialize second element
	        anArray[1] = 200;
	        // and so forth
	        anArray[2] = 300;
	        anArray[3] = 400;
	        anArray[4] = 500;
	        anArray[5] = 600;
	        anArray[6] = 700;
	        anArray[7] = 800;
	        anArray[8] = 900;
	        anArray[9] = 1000;

	        System.out.println("Element at index 0: "
	                           + anArray[0]);
	        System.out.println("Element at index 1: "
	                           + anArray[1]);
	        System.out.println("Element at index 2: "
	                           + anArray[2]);
	        System.out.println("Element at index 3: "
	                           + anArray[3]);
	        System.out.println("Element at index 4: "
	                           + anArray[4]);
	        System.out.println("Element at index 5: "
	                           + anArray[5]);
	        System.out.println("Element at index 6: "
	                           + anArray[6]);
	        System.out.println("Element at index 7: "
	                           + anArray[7]);
	        System.out.println("Element at index 8: "
	                           + anArray[8]);
	        System.out.println("Element at index 9: "
	                           + anArray[9]);
	        
	        int i = anArray.length;
	 }


	

}
