package collections;

import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {

		ArrayList items = new ArrayList();
		
		items.add("Java");
		items.add("101");
		items.add("experts!");
		items.add(0,"Hello");
		
		items.size();
		
		items.remove("101");
		if (items.contains("Java")){
			System.out.println("Ahh java! ");
		}
		
		ArrayList list = new ArrayList<>(5);
		
	/*
	 * 	The first three add() calls add a String instance to the end of the list. 
	 *  The last add() call adds a String at index 0, meaning at the beginning of the list.
	 */
		
		
		/*
		 * How would we remove an element from the arraylist ?
		 */
	



	}

}
