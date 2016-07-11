package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class iterator {

	public static void main(String[] args) {
		ArrayList<String> listA = new ArrayList<String>();

		listA.add("element 0");
		listA.add("element 1");
		listA.add("element 2");

		//access via index
		String element0 = listA.get(0);
		String element1 = listA.get(1);
		String element3 = listA.get(2);


		//access via Iterator
		Iterator iterator = listA.iterator();
		while(iterator.hasNext()){
		  String element = (String) iterator.next();
		  System.out.println(element);
		}


		//access via for each-loop
		for(String elementsInList : listA) {
		    System.out.println(elementsInList);
		}

		
		
		//Removing an element from the list. 
		
		
		
		
		
		
		
		
	}

}
