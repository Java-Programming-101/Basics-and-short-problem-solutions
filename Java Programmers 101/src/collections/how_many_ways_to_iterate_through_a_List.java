package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class how_many_ways_to_iterate_through_a_List {

	public static void main(String[] args) {
		
		/*
		 * The first way to iterate a List is to use an Iterator.
		 * Here is an example of iterating a List with an Iterator:
		 */
		
		List list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");

		//add elements to list

		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
		    Object next = iterator.next();
		    System.out.println((String)next);
		}
		
		/*
		 * Once you have obtained an Iterator you can keep calling its hasNext() method until it returns false. Calling hasNext() is done inside a while loop as you can see.
		 * Inside the while loop you call the next() method of the Iterator interface to obtain the next element pointed to by the Iterator.
		 * If the List is typed you can save some object casting inside the while loop. Here is an example:
		 */ 
		List<String> mylistStr = new ArrayList<>();

		Iterator<String> iterator1 = mylistStr.iterator();
		while(iterator1.hasNext()){
			String obj = iterator1.next();
			System.out.println(obj);
		}
		
		
		/*
		 * Another way to iterate a List is to use the for loop added in Java 5 (also called a "for each" loop). 
		 * Here is an example of iterating a List using the for loop:
		 */
		 
		List list1 = new ArrayList();

		list1.add("1");
		list1.add("2");
		list1.add("3");
		
		

		for(Object obj : list1) {
		    System.out.println(obj);
		}
		
		
		
		
	}

}
