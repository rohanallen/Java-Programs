package numberPrograms;

//Write a Java program to check the year is leap year or not.
import java.util.*;

public class Leap_Year {
	public void isLeapYear(int year) {
		if (year % 400 == 0) {
			System.out.println(year + " is a Leap Year.");
		} else if ((year % 4 == 0) && (year % 100 != 0)) {
			System.out.println(year + " is a Leap Year.");
		} else {
			System.out.println(year + " is a not Leap Year.");
		}
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input Year");
		int year = in.nextInt();
		Leap_Year obj = new Leap_Year();
		obj.isLeapYear(year);
	}
}
