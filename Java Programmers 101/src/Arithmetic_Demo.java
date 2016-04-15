
public class Arithmetic_Demo {

	public static void main(String[] args) {

	        int result = 1 + 2;
	        // result is now 3
	        System.out.println("1 + 2 = " + result);
	        int original_result = result;
	        // original result = 3
	        result = result - 1; // the minus operator acts to subtract numbers.
	        // result is now 2
	        System.out.println(original_result + " - 1 = " + result);
	        original_result = result;

	        result = result * 2;// the * symbol acts as a multiplication operator
	        // result is now 4
	        System.out.println(original_result + " * 2 = " + result);
	        original_result = result;

	        result = result / 2; // the backslash acts as a division operator.
	        // result is now 2
	        System.out.println(original_result + " / 2 = " + result);
	        original_result = result;

	        result = result + 8; // Note that the addition symbol operates differently with numbers an strings. numbers are added together, strings are concatenated.
	        // result is now 10
	        System.out.println(original_result + " + 8 = " + result);
	        original_result = result;

	        result = result % 7; // modulo operator finds the remainder
	        // result is now 3
	        System.out.println(original_result + " % 7 = " + result);


		
	    }

	

}
