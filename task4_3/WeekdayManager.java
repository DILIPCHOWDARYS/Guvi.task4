package task4_3;
import java.util.Scanner;
public class WeekdayManager {
	public static void main(String [] agrs) {
		Scanner sc = new Scanner(System.in);
		Weekday weekday = new Weekday();
		System.out.print("Enter the day Index(0-6): ");
		try {
			int index=sc.nextInt();
			System.out.println("Day: "+Weekday.getDay(index));
			}
		catch(InvalidDayIndexException e)
		{
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}