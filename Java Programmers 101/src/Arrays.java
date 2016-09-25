

public class Arrays {
	int[] myNextArray;
	public void ArrayInitilizeation() {
	    //to declare an array you need to state what TYPE of array it is followed by [],
		//then give a meaningful name.
		
		

		//Another array way.
		
	
		//Notice that the [] are empty. this is because the size of an array is not part of its type. 
		myNextArray.toString();
		myNextArray = new int[10];
		myNextArray.toString();

		
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
	        
	        
	        Object[] haystack3 = {1,2,3,4,5,6,7,8,8,7,5,4,3,4,5,6,67,5,5,3,3,4,2,34,234,23,4,234,324,324,"needle",1,2,3,4,5,5,6,5,4,32,3,45,54};
	        
	        for (Object object : haystack3) {
	        	if(object.toString().equals("needle")){
	        		System.out.println("BOOM");
	        	}
			}
	        
	        int iteration = 0; 
	        String s = null;
	        
	          for(Object element: haystack3){
	            if (element.toString().equals("needle")){
	              s ="found needle at position " + iteration;
	            }
	            iteration++;
	          }
	          
	          System.out.println(s);
	     
	        System.out.println(haystack3.toString());
	 }


	

}
