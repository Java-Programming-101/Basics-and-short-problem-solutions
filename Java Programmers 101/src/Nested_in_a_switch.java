
public class Nested_in_a_switch {

	public static void main(String[] args) {
		
		
		int month = 2;
        int year = 2001;
        int numDays = 0;

        switch (month) {
            case 1: 
                numDays = 31;
                break;
            case 3: 
                numDays = 31;
                break;
            case 5:
                numDays = 31;
                break;
            case 7: 
                numDays = 31;
                break;
            case 8: 
                numDays = 31;
                break;
            case 10:
                numDays = 31;
                break;
            case 12:
                numDays = 31;
                break;
            case 4: 
                numDays = 30;
                break;
            case 6:
                numDays = 30;
                break;
            case 9: 
                numDays = 30;
                break;
            case 11:
                numDays = 30;
                break;
            case 2:
                if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0))
                    numDays = 29;
                else
                    numDays = 28;
                break;
            default:
                System.out.println("Invalid month.");
                break;
        }
        System.out.println("Number of Days = "
                           + numDays);

	}

}
//case 1: case 3: case 5:
//case 7: case 8: case 10:
//case 12:
//    numDays = 31;
//    break;
//case 4: case 6:
//case 9: case 11:
//    numDays = 30;
//    break;
//case 2:
//    if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0))
//        numDays = 29;
//    else
//        numDays = 28;
//    break;
//default:
//    System.out.println("Invalid month.");
//    break;