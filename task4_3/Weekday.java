package task4_3;

public class Weekday {
	private static final String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

	public static String getDay(int index) throws InvalidDayIndexException{
		
		if (index < 0 || index > 6) {
            throw new InvalidDayIndexException("Invalid index! Please enter a value between 0 and 6.");
        }
        return weekdays[index];
	}

}
