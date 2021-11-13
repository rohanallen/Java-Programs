package numberPrograms;

//Write a Java program to Calculate and Display the sum of 4 digits number.
import java.util.*;

public class Sum_of_Digits {
	int sum, number;

	public void sumOfDigits(int n) {
		sum = 0;
		number = n;
		while (number != 0) {
			sum = sum + (number % 10);
			number = number / 10;
		}
		System.out.println("Sum of Digits of " + n + " is " + sum + ".");
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number");
		int a = in.nextInt();
		Sum_of_Digits obj = new Sum_of_Digits();
		obj.sumOfDigits(a);

	}

}
