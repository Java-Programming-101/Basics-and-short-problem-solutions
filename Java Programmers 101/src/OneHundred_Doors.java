
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
		
		
		boolean[] ArrayOfdoors = new boolean[101];//Create an Array of 101 because we need to use the number 
										   //of passes over the doors to calculate where to go to next.
		
		
        for (int Passes = 1; Passes <= 100; Passes++) { // for each pass ; while the number of passes is less than or equal to 100; itterate through each. 
            for (int door = Passes; door <= 100; door++) {// for each door while the number of doors is less than or equal to 100  ; itterate through each.
                if(door % Passes == 0) ArrayOfdoors[door] = !ArrayOfdoors[door];
                // if the door number divided by the number of passes is equal to 0 reverse the boolean 
            }
        }
		
		for(int i = 1 ; i < ArrayOfdoors.length ; i++){
			System.out.println("Door "+ (i) +" is open " + ArrayOfdoors[i]);
		}

	}

}
