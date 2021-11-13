package basicStuff;

//Write a Java program to perform Multiplication of two numbers without using  * operator.
import java.util.*;

public class Multiplication_No_Operator {
	double mul;

	public double mul(double a, double b) {
		mul = 0;
		for (int i = 1; i <= b; i++) {
			mul = mul + a;
		}
		return (mul);
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two numbers to multiply");
		double a = in.nextDouble();
		double b = in.nextDouble();
		Multiplication_No_Operator obj = new Multiplication_No_Operator();
		System.out.println("Product is "+obj.mul(a, b)+".");

	}

}
