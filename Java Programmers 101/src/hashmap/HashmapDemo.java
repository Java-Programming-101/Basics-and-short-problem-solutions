package hashmap;

import java.util.HashMap;

public class HashmapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Double> demoHash= new HashMap<String, Double>();
	
		demoHash.put("this is a string", 0.1);
		demoHash.put("this is a string", 0.2);
		demoHash.put("this is a string", 0.3);
		demoHash.put("this is a string", 0.4);
		demoHash.put("this is a string", 0.5);
		demoHash.put("this is a string", 0.6);
		
	
		System.out.println(demoHash.get("this is a string"));
		
	}
	

}
