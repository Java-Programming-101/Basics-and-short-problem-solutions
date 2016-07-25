package stringBuilder;

public class Passing_numbers {

	public static void main(String[] args) {
		StringBuilder numbers = new StringBuilder();
		/*
		 * What happens if i pass in a int to the append method?
		 */
		
		numbers.append(Integer.MAX_VALUE);
		
		/*
		 * or a float?
		 */
		
		//numbers.append(Float.MAX_VALUE);
		
		/*
		 * 
		 */
		
		//numbers.append(Long.MAX_VALUE);
		
		System.out.println(numbers);

	}

}
