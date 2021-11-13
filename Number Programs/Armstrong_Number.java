package numberPrograms;

//Write a Java program to check whether given number is Armstrong or not.
import java.util.*;

public class Armstrong_Number {
	int sum, a, n;

	public void isArmstrong(int number) {
		n = number;
		sum = 0;
		while (n != 0) {
			a = n % 10;
			sum = sum + (a * a * a);
			n = n / 10;
		}
		if (number == sum) {
			System.out.println(number + " is an Armstrong Number.");
		} else {
			System.out.println(number + " is not an Armstrong Number.");
		}
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number");
		int a = in.nextInt();
		Armstrong_Number obj = new Armstrong_Number();
		obj.isArmstrong(a);
	}
}
