package timeAndDate;

import java.time.LocalDate;
import java.time.Month;

public class ManipulatingDateAndTime {

	public static void main(String[] args) {

	/*
	 * Manipulating the dates and times is easy!
	 * you can do things like 
	 * LocalDate date = LocalDate.of(2016, Month.JANUARY, 20);
	 * 
	 * date.plusYears(1);
	 * date.plusDays(4);
	 * date.minusYears(4)
	 */
	
		/* 
		 * What is the outcome of this?
		 */
	LocalDate date = LocalDate.of(2000, Month.JANUARY, 31);
	
	
	
	System.out.println(date.plusMonths(1));
	
	date = date.plusYears(1);
	System.out.println(date.plusMonths(1));
	date = date.plusYears(1);
	System.out.println(date.plusMonths(1));
	date = date.plusYears(1);
	System.out.println(date.plusMonths(1));
	System.out.println(date);
	
	date = date.minusYears(1);

	//date.plusHours(); compiler ERROR!!! because LocalDate does not deal with time at all so cannot call plushours
	
	System.out.println(date);
	
	
    /*
	* Date and time classes are immutable, just like a String 
	* 
	* That means that you need to remember to assign the results to a reference variable so they are not lost.
	*/
	
	/*
							Can call on	LocalDate?  	Can call on	LocalTime?	Can call on	LocalDateTime?
	plusYears/minusYears 			Yes 						No 						Yes
	plusMonths/minusMonths 			Yes 						No 						Yes
	plusWeeks/minusWeeks 			Yes 						No 						Yes
	plusDays/minusDays 				Yes 						No 						Yes
	plusHours/minusHours 			No 							Yes 					Yes
	plusMinutes/minusMinutes 		No 							Yes 					Yes
	plusSeconds/minusSeconds 		No 							Yes 					Yes
	plusNanos/minusNanos 			No 							Yes 					Yes
	
	*/
	
	
	
	
	
	
	}

}
