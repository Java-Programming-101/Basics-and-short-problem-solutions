import java.time.*;
public class DateAndTime {

	public static void main(String[] args) {
		// LocalDateTime provides the date followed by the time down to the nanosecond!!!
		System.out.println(LocalDateTime.now());
		
		// LocalDate provides the date only.
		System.out.println(LocalDate.now());
		
		// LocalTime provides the time to the nanosecond.
		System.out.println(LocalTime.now());
		
		LocalDate date = LocalDate.now();
		date.plusYears(1000);
		System.out.println(date);

	}

}
