
public class Switch_Statements {

	public static void main(String[] args) {
		/*
		 * switch statements are similar in theeory to an if statement. 
		 * but say you wan to find out how many days a month has in a year. 
		 * you would need an if statement for each month of the year or a lot of conditions in the if statement
		 * to ensure you reached the correct output. Try the is statement method to find out how much code you will need. 
		 * 
		 * The switch statement has a syntax of 
		 * 
		 * switch (expression){
		 * 	 case (value):
		 *       statements
		 *   break
		 * 	 case (value):
		 *       statements
		 *   break
		 *   
		 * 
		 * The switch statement will try to match the expression to the case and run the code associated with the matchhing case.
		 * you will see that if you want certain cases to run the same code you can stack the cases. 
		 * 
		 * notice the break statements. this makes the code thats running jump out of the switch statement.
		 * failing to provide the break statement will result in what can be called fall-through. This is where the 
		 * the case is matched with the key but the code in all other cases below the case that was matched will
		 * be executed. 
		 * 
		 * Have a play with the code below and see what happens!
		 */
		int month = 1;

        switch (month) {
            case 1:  
            	System.out.println("January");
            
            case 2:  
            	System.out.println("February");

            
            case 3:  
            	System.out.println("March");
            break;
            case 4:  
            	System.out.println("April");
            
            case 5:  
            	System.out.println("May");
            
            case 6:  
            	System.out.println("June");
            
            case 7:  
            	System.out.println("July");
            
            case 8:  
            	System.out.println("August");
            
            case 9:  
            	System.out.println("September");
            
            case 10: 
            	System.out.println("October");
            
            case 11: 
            	System.out.println("November");
            
            case 12: 
            	System.out.println("December");
                break;
            
            default: 
            	break;
        }
        
	}
}
