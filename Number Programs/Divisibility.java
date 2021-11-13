/*Write a Java program to find out all odd numbers divisible by 5 from 
the range of integers 200 to 800.*/
package numberPrograms;

import java.util.*;

public class Divisibility {
	public void isDivisible(int a, int b) {
		for (int i = a; i <= b; i++) {
			if ((i % 2 != 0) && (i % 5 == 0))
				System.out.println(i);
		}
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number 1 ");
		int a = in.nextInt();
		System.out.println("Enter Number 2");
		int b = in.nextInt();
		System.out.println("The Numbers are :");
		Divisibility obj = new Divisibility();
		obj.isDivisible(a, b);

	}
}
