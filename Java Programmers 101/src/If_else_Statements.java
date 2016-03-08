// for use in Java 101 on 24/02/2015
public class If_else_Statements {

	public static void main(String[] args) {
		int someCondition = 10;
		//A basic if statement.
		if(someCondition == 10)
		{
			System.out.println("I am in the if block!");
		}
		
		
		
		//A basic if else statement
		if (someCondition== 100) 
		{
			System.out.println("I am in the if block!");

		} 
		else 
		{
			System.out.println("I am in the else block!");

		}
		
		
		
		
		//how many else statements can you have ?
		
		
		
		
		
		
		
		
		
		
		
		
	   // ternary if-else mainly used for assignments. -
		
		int result = (someCondition < 5) ? 3 : 400;
		
		System.out.println("result = "+ result);


	}

}
