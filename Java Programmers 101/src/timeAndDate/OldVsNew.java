package timeAndDate;

import java.util.*; 
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class OldVsNew {

	public static void main(String[] args) {
		
		//Importing Creating an object with the current date
		
		// OLD
		Date dO = new Date(); 
		
		//NEW
		LocalDate dN = LocalDate.now();
		
		
		//Creating an	object with	the current	date and time
		
		//OLD
		Date dO2 = new Date(); 
		
		//NEW
		LocalDateTime dN2 = LocalDateTime.now();
		
		
		//Creating an object	representing January 1,	2015
		
		//OLD
		Calendar c = Calendar.getInstance();
		c.set(2015, Calendar.JANUARY, 1);
		Date jan = c.getTime();
		System.out.println(jan);
		//or
		Calendar c2 = new GregorianCalendar(2015,Calendar.JANUARY, 1);
		
		//NEW
		LocalDate janN =LocalDate.of(2015,Month.JANUARY,1);
		
		
		
		//Creating January 1, 2015 without the constant
		//OLD
		Calendar c3 = Calendar.getInstance();
		c3.set(2015, 0, 1);
		Date janua = c3.getTime();
		
		
		// New 
		LocalDate januar =	LocalDate.of(2015,1, 1);

	}

}
