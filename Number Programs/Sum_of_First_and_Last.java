package numberPrograms;

//Write a Java program to Obtain the sum of first and last digit of four digit number.
import java.util.*;

public class Sum_of_First_and_Last {
	int first, last, n;

	public void sum(int number) {
		n = number;
		last = n % 10;// last digit
		while (n > 9) {
			n = n / 10;
		}
		first = n; // first digit
		System.out.println("Sum of first and last Digit of " + number + " is " + (first + last) + ".");
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number");
		int a = in.nextInt();
		Sum_of_First_and_Last obj = new Sum_of_First_and_Last();
		obj.sum(a);
	}
}
