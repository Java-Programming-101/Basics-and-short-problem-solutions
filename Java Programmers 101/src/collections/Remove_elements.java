package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Remove_elements {

	public static void main(String[] args) {
		ArrayList<String> listA = new ArrayList<String>();

		listA.add("element 0");
		listA.add("element 1");
		listA.add("element 2");

		listA.remove(1);
		
		
		listA.add("Element 3");
		
		
		listA.remove("element 0");
		
		

		for(String Element : listA){
			System.out.println(Element);
		}


	}

}
