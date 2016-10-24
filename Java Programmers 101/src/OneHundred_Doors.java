
public class OneHundred_Doors {
	
//	Problem: You have 100 doors in a row that are all initially closed. 
//	You make 100 passes by the doors. The first time through, you visit 
//	every door and toggle the door (if the door is closed, you open it; 
//	if it is open, you close it). The second time you only visit 
//	every 2nd door (door #2, #4, #6, ...). The third time, 
//	every 3rd door (door #3, #6, #9, ...), etc, until you only visit the 100th door.
//
//	Question: What state are the doors in after the last pass? Which are open, which are closed?

	public static void main(String[] args) {
		
		
		//unoptimized 
		
        boolean[] doors = new boolean[101];
        for (int i = 1; i <= 100; i++) {
            for (int j = i; j <= 100; j++) {
                if(j % i == 0) doors[j] = !doors[j];
            }
        }
        for (int i = 1; i <= 100; i++) {
            System.out.printf("Door %d: %s%n", i, doors[i] ? "open" : "closed");
        }
		
		
		System.out.println();
		
		
		

		/*
		 * the only doors that remain open are those whose numbers are perfect squares.
		 * 
		 * Opening only those doors is an   optimization   that may also be expressed; 
		 * however, as should be obvious, this defeats the intent of comparing 
		 * implementations across programming languages. 
		 */
		
		
		
		
		// optimized 
		boolean[] ArrayOfdoors = new boolean[100];//Create an Array of 101 because we need to use the number 
										   //of passes over the doors to calculate where to go to next.
		
		
        for (int Passes = 0; Passes <= 9; Passes++) {  
        	ArrayOfdoors[Passes*(Passes+2)]=true; // if the result is the squares roots opened so....
        }
		
		for(int i = 0 ; i < ArrayOfdoors.length ; i++){
			System.out.println("Door "+ (i+1) +" is "+ (ArrayOfdoors[i]?"open":"closed"));
		}

	}

}
