
public class Nested_in_a_switch {

	public static void main(String[] args) {
		/*
		 * switch statements are similar in theeoryy to an if statement. 
		 * but say you wan to find out how many days a month has in a year. 
		 * you would need an if statement for each month of the year or alot of condditions in the if statement
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
		 * 
		 * You will note in this example that you can also nest other statements in the case block of code;
		 */
		
		int month = 3;
        int year = 2001;
        int numDays = 0;

        switch (month) {
            case 1: case 3: case 5: case 7: case 8:case 10 :case 12:
                numDays = 31;
                break;
                
            case 4: case 6: case 9: case 11:
                numDays = 30;
                break;
        
            case 2:
                if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)){
                    numDays = 29;
                }
                else
                {
                    numDays = 28;
                }
                break;
            default:
                System.out.println("Invalid month.");
                break;
        }
        System.out.println("Number of Days = "
                           + numDays);

	}

}
