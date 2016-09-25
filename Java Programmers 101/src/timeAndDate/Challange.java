package timeAndDate;

import java.time.LocalDate;
import java.time.Month;

public class Challange {
/*
 * 
 *  Our zoo performs animal enrichment activities to give the animals new toys for
 *  something fun to do. 
 *  The head zookeeper has decided to switch the toys every month. This system will continue 
 *  for three months to see how it works out.
 *  
 *  your task is to write a program will tell the zoo keeper, given a start and end date what day he needs to change the toys 
 *  
 *  
 */
	public static void main(String[] args) {
	
		
		LocalDate start = LocalDate.of(2016, Month.JANUARY, 1);
		LocalDate end = LocalDate.of(2016, Month.MARCH, 30);
		
		giveNewToys(start, end);
	}
	
	private static void giveNewToys(LocalDate start, LocalDate end) {
		LocalDate upto = start;
		
		
		while(upto.isBefore(end)){
			System.out.println("Give New Toy: "+upto);
			upto = upto.plusMonths(1);
		}

	}

}
