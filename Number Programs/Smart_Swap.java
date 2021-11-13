package numberPrograms;

//Write a Java program to swap two numbers without using third variable.
import java.util.*;

public class Smart_Swap {
	public void swap(int a, int b) {

		a = a + b;
		b = a - b;
		a = a - b;
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
		Smart_Swap obj = new Smart_Swap();
		obj.swap(a, b);
	}
}
