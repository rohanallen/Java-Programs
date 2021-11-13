package numberPrograms;

//Write a Java program to print Fibonacci Series.
import java.util.*;

public class Fibonacci_Series {
	int a, b, next;

	public void printFibonacci(int n) {
		if (n == 1) {
			System.out.println("0");
		} else if (n == 2) {
			System.out.println("0");
			System.out.println("1");
		} else {
			a = 0;
			b = 1;
			System.out.println(a);
			System.out.println(b);
			for (int i = 2; i < n; i++) // logic understand starts from 2 as 0 and 1 fixed
			{
				next = a + b;
				System.out.println(next);
				a = b;
				b = next;
			}
		}

	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number upto which you want to print Fibonacci Series");
		int number = in.nextInt();
		System.out.println("The Fibonacci Series upto " + number + " term(s) is:");
		Fibonacci_Series obj = new Fibonacci_Series();
		obj.printFibonacci(number);
	}

}
