package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Collection_Operation {
	public static void main(String[] args) {
		Set  set  = new HashSet();
		List list = new ArrayList();

		Collection_Operation.doSomething(set);
		Collection_Operation.doSomething(list);  
	
	}
	
	
	public static void doSomething(Collection collection) {
	    
	    Iterator iterator = collection.iterator();
	    while(iterator.hasNext()){
	      iterator.next();

	      //do something to object here...
	    }
	  }
}
