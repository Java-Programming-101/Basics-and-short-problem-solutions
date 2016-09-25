package lambda;

public class Tester {
	
	interface Mathoperation{
		int operation (int a, int b);
	}
	
	interface Greeting {
		void sayMessage (String message);
	}
	
	public static void main(String[] args) {
		Tester tester = new Tester();
		
		
		Mathoperation additionAnonInner = new Mathoperation() {
			@Override
			public int operation(int a, int b) {
				return a+b;
			}
		};
		
		// with type declaration
		Mathoperation addition = (int a , int b) -> a+b;
		// without type declaration
		Mathoperation  subtraction = (a,b) -> a-b;
		
		
		//with type declaration
		Mathoperation multiplication = (int a, int b) -> a*b;
		//without  type declaration
		Mathoperation division = (a,b)-> a/b;
		
		System.out.println("10 + 5 = " + tester.operate(10, 5, additionAnonInner));
		  System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
	      System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
	      System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
	      System.out.println("10 / 5 = " + tester.operate(10, 5, division));
	      System.out.println("10 / 5 = " + tester.operate(10, 5, division));

	}


	
	private int operate(int a , int b , Mathoperation mathoperation){
		return mathoperation.operation(a, b);
	}
	
}
