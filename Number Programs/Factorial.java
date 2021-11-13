package numberPrograms;

//Write a Java program to print Factorial of Number
import java.util.*;

public class Factorial {
	int fact;

	public int factorial(int n) {
		fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return (fact);
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number");
		int a = in.nextInt();
		Factorial obj = new Factorial();
		System.out.println("The Factorial of "+ a+ " is " + obj.factorial(a));
	}
}
