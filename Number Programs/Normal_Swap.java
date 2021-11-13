package numberPrograms;

//Write a Java program to swap two numbers using third variable.
import java.util.*;

public class Normal_Swap {
	int temp;

	public void swap(int a, int b) {
		temp = a;
		a = b;
		b = temp;
		System.out.println("After Swapping");
		System.out.println("Number 1 is: " + a);
		System.out.println("Number 2 is: " + b);
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number 1");
		int a = in.nextInt();
		System.out.println("Enter Number 2");
		int b = in.nextInt();
		Normal_Swap obj = new Normal_Swap();
		obj.swap(a, b);
	}
}
