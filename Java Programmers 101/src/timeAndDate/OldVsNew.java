package timeAndDate;

import java.util.*; 
import java.time.*;

public class OldVsNew {

	public static void main(String[] args) {
		
		//Importing Creating an object with the current date
		
		new Date(); 
		
		LocalDate.now();
		
		
		//Creating an	object with	the current	date and time
		
		new Date(); 
		
		LocalDateTime.now();
		
		
		//Creating an object	representing January 1,	2015
		
		//OLD
		Calendar c = Calendar.getInstance();
		c.set(2015, Calendar.JANUARY, 1);
		Date jan = c.getTime();
		System.out.println(jan);
		new GregorianCalendar(2015,Calendar.JANUARY, 1);
		
		LocalDate.of(2015,Month.JANUARY,1);
		
		
		
		//Creating January 1, 2015 without the constant
		//OLD
		Calendar c3 = Calendar.getInstance();
		c3.set(2015, 0, 1);
		c3.getTime();
		
		
		LocalDate.of(2015,1, 1);

	}

}
