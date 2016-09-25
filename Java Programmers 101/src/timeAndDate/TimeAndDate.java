package timeAndDate;
import java.time.*;


public class TimeAndDate {

	public static void main (String args[]){
		
		/*
		 * first of all you need to import java.time.*
		 */
		
		
		/*
		 * LocalDate contains just the date  no time or time Zone 
		 */
		
		/*
		 * LocalTime contains just the time  no date and no time zone
		 */
		
		/*
		 * LocalDateTime contains both the date and time but no time zone. 
		 */
		
		/*
		 * Oracle recommends avoiding timezones unless they are specifically needed 
		 * so i wont be discussing time zones but if you do need them there is also 
		 * ZonedDateTime that will be able to handle them 
		 */
		
		/* the standard output format for the date is year/ month/ day. 
		 * 
		 * 
		 * The standard date is formatted in the American way, as the OCA exam 
		 * does not ask for another format so we will not focus on changing that too much 
		 */
		System.out.println(LocalDate.now());
		
		
		/* 
		 * The Standard output for the time is 24hr based hour, minutes, seconds nanoseconds
		 */
		System.out.println(LocalTime.now());
		
		/*
		 * The Standard Date and time output is  
		 * year / month / day / T / hour/ minute/ seconds/ nano.
		 */
		
		System.out.println(LocalDateTime.of(2000, 3, 12, 1, 00));
		
		
		/*
		 * How do you create a date object to manipulate? or when you want to declare a specific date?
		 * 
		 *     type      variable = LocalDate.....
		 *     
		 * ******** Question for the group **********
		 */
		
		
		
	    /*
	     * type   variable = LocalDate.of(int year, int month, int day);
	     */
		
		LocalDate.of(2000, 1, 1);
		
		/*
		 * you can also declare this using the actual month 
		 */
		
		LocalDate.of(2000, Month.JANUARY, 1);
		
		/*
		 * You are provided with multiple constructors to allow you to specify different things
		 * 
		 * public static LocalDateTime of(int year, int month,int dayOfMonth, int hour, int minute);
		 * public static LocalDateTime of(int year, int month,int dayOfMonth, int hour, int minute, int second)
		 * public static LocalDateTime of(int year, int month,int dayOfMonth, int hour, int minute, int second, int nanos)
		 * public static LocalDateTime of(int year, Month month,int dayOfMonth, int hour, int minute)
		 * public static LocalDateTime of(int year, Month month,int dayOfMonth, int hour, int minute, int second)
		 * public static LocalDateTime of(int year, Month month,int dayOfMonth, int hour, int minute, int second, int nanos)
		 * public static LocalDateTime of(LocalDate date, LocalTime)
		 */
		
		
		/*
		 * Have you noticed that have not used a constructor?
		 * 
		 * **********why is that ?**************
		 * 
		 * The Date and time classes have private constructors to force you to use the static methods
		 * 
		 */
		
		//LocalDate date = new LocalDate(2000,1,1); // does not compile. you are not able to construct a datetime object directly 
		
		/*
		 * What happens when we try to declare the 32nd jan?
		 */
		
		LocalDate.of(2000, Month.JANUARY, 32);
		
		/*
		 * It compiles but what happens when we run this ? 
		 * 
		 * thows DateTimeExeption 
		 */
	}
	
}
