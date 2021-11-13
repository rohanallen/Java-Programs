package basicStuff;

//Write a Java program to print multiplication Table (1 to 15).
import java.util.*;

public class Multiplication_Table {
	public void table(int n) {
		for (int i = 1; i <= 15; i++) {
			System.out.println(n + " * " + i + " = " + (n * i) + ".");
		}
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = in.nextInt();
		Multiplication_Table obj = new Multiplication_Table();
		obj.table(n);
	}
}
