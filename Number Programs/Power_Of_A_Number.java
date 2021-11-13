package numberPrograms;

// Write a Java program to calculate the power of Number.
import java.util.*;

public class Power_Of_A_Number {
	int pow;

	public int power(int a, int b) {
		pow = 1;
		for (int i = 1; i <= b; i++) {
			pow = pow * a;
		}
		return pow;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Base Number ");
		int a = in.nextInt();
		System.out.println("Enter Power");
		int b = in.nextInt();
		Power_Of_A_Number obj = new Power_Of_A_Number();
		System.out.println(a + " raised to the power of " + b + " is " + obj.power(a, b));
	}
}
