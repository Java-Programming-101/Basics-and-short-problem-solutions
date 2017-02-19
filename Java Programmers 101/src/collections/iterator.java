package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class iterator {

	public static void main(String[] args) {
		ArrayList<String> listA = new ArrayList<String>();

		listA.add("element 0");
		listA.add("element 1");
		listA.add("element 2");

//		listA.get(0);
//		listA.get(1);
//		listA.get(2);


		//access via Iterator
		
		// an iterator can only move forward. 
		Iterator iterator = listA.iterator();
		while(iterator.hasNext()){
		  System.out.println(iterator.next());
		}


		//access via for each-loop
		for(String elementsInList : listA) {
		    System.out.println(elementsInList);
		}

	
		// if you wanted to move forward and backward then you would need a list iterator. 
		ListIterator iterator2 = listA.listIterator();
		iterator2.hasPrevious();
		
		
		
		
		
		
		
	}

}
