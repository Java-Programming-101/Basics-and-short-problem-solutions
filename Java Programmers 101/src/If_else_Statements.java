// for use in Java 101 on 24/02/2015
public class If_else_Statements {

	/*
	 * Please look at the Comparison_ops class to look at the comparison operators in use.
	 */
	
	/*
	 * If statements are the basic way of controlling the flow of your program.
	 * You wont always want all of your code to run, you will want to check certain conditions are true (or false)
	 * before you action the code in the block. 
	 * 
	 * The syntax for the if statement is very simple. As you will see below. 
	 * 
	 * 	if (someCondition is true){
	 *  	do something
	 *  }
	 */
	
	public static void main(String[] args) {
		int someCondition = 10;
		
		//A basic if statement.
		if(someCondition == 10)
		{
			System.out.println("I am in the if block!");
		}
		
		
		
		//A basic if else statement
		/*
		 * sometimes if the condition is false you will want another code block to always run. 
		 * In this situation you should use an if-else code block. This looks like 
		 * 
		 * 	if (someCondition is true){
	     *	 	do something
	     *  } else {
	     *  	do something else
	     *  }
		 */
		
		if (someCondition== 100) 
		{
			System.out.println("I am in the if block!");

		} else {
			System.out.println("I am in the else block!");
		}
		
		
		/* 
		 * If the first condition is false but you don't necessarily wan the else block to run you can 
		 * create and if-else If condition. 
		 * 
		 * 	if (someCondition is true){
	     *	 	do something
	     *  } else if (another condition is true {
	     *  	do something else
	     *  } 
		 */
		
		if (someCondition== 100) 
		{
			System.out.println("I am in the if block!");

		} else if (someCondition < 99) {
			System.out.println("I am in the else if block!");
		}
		
		
		
		
		
		
	   /*
	    *  there is also something called a ternary operator (?)  that you can use to assign one of two values to
	    *  a variable based on the outcome of a condition. 
	    *  
	    *  The syntax is 
	    *  
	    *  type variableName = ( if some condition is true ) ? value1 : value 2 ;
	    *  
	    *  This will assign value 1 if true and value 2 if false.
	    *  
	    *  have a look at the code below, run it and find out what value will be assigned to result. 
	    *  
	    */
		
		
		int result = (someCondition < 5) ? 3 : 400;
		
		System.out.println("result = "+ result);


	}

}
