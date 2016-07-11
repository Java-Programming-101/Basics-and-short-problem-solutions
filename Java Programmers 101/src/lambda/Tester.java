package lambda;

public class Tester {

	public static void main(String[] args) {
		Tester tester = new Tester();
		
		
		// with type declaration
		Mathoperation addition = (int a , int b) -> a+b;
		// without type declaration
		Mathoperation  subtraction = (a,b) -> a-b;
		
		
		//with type declaration
		Mathoperation multiplication = (int a, int b) -> a*b;
		//without  type declaration
		Mathoperation division = (a,b)-> a/b;
		
		
		  System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
	      System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
	      System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
	      System.out.println("10 / 5 = " + tester.operate(10, 5, division));
	      System.out.println("10 / 5 = " + tester.operate(10, 5, division));

		

	}

	interface Mathoperation{
		int operation (int a, int b);
	}
	interface Greeting {
		void sayMessage (String message);
	}
	
	private int operate(int a , int b , Mathoperation mathoperation){
		return mathoperation.operation(a, b);
	}
	
}
