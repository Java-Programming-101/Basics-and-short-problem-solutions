package timeAndDate;

import java.time.*;


public class ChallangeImprovement {

	public static void main(String[] args) {
		LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
		LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
		Period period = Period.ofMonths(1); // create a period
		changeAnimalToys(start, end, period);
	}
	
	private static void changeAnimalToys(LocalDate start, LocalDate end, Period period) { // uses the generic period
		LocalDate upTo = start;
		
		while (upTo.isBefore(end)) {
			System.out.println("give new toy: " + upTo);
			upTo = upTo.plus(period); // adds the period
			}
		}
//		The method can add an arbitrary period of time that gets passed in. This allows us to
//		reuse the same method for different periods of time as our zookeeper changes her mind.
//		There are five ways to create a Period class:
		
		Period annually = Period.ofYears(1); // every 1 year
		Period quarterly = Period.ofMonths(3); // every 3 months
		Period everyThreeWeeks = Period.ofWeeks(3); // every 3 weeks
		Period everyOtherDay = Period.ofDays(2); // every 2 days
		Period everyYearAndAWeek = Period.of(1, 0, 7); // every year and 7 days

}
