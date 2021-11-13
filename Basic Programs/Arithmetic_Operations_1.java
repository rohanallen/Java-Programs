package basicStuff;

//Write a Java program to perform basic arithmetic operations of two numbers. 
import java.util.*;

public class Arithmetic_Operations_1 {
	double sum, sub, mul, div;

	public void add(double a, double b) {
		sum = a + b;
		System.out.println("Sum of " + a + " and " + b + " is " + sum + ".");
	}

	public void sub(double a, double b) {
		sub = a - b;
		System.out.println("Subtraction of " + a + " and " + b + " is " + sub + ".");
	}

	public void mul(double a, double b) {
		mul = a * b;
		System.out.println("Multiplication of " + a + " and " + b + " is " + mul + ".");
	}

	public void div(double a, double b) {
		div = a / b;
		System.out.println("Division of " + a + " and " + b + " is " + div + ".");
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two Numbers to perform arithmetic operations on");
		double a = in.nextDouble();
		double b = in.nextDouble();
		Arithmetic_Operations_1 obj = new Arithmetic_Operations_1();
		obj.add(a, b);
		obj.sub(a, b);
		obj.mul(a, b);
		obj.div(a, b);

	}

}
