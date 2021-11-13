package numberPrograms;

//Write a Java program to find sum of all digits of all the numbers between 10 and 50,
//which are divisible by 3
import java.util.*;

public class Sum_of_Digits_Advanced {
	int arr[] = new int[100];
	int c = 0;
	int sum, sum1=0;

	public void divBy3(int x, int y) {
		for (int i = x; i <= y; i++) {
			if (i % 3 == 0) {
				arr[c++] = i;
			}
		}
		System.out.println("Numbers divisibe by 3 between " + x + " and " + y + " are: ");
		for (int i = 0; i < c; i++) {

			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < c; i++) {
			
			sum1 = sum1 + sum(arr[i]); // calling sum function
		}
		System.out.println("Sum of Digits are : "+sum1);// printing final sum of digits 
	}

	public int sum(int a) {
		sum = 0;
		while (a != 0) {
			sum = sum + (a % 10);
			a = a / 10;
		}
		if(sum<10)// to make sure sum is single digit
		{
		return sum;
		}
		else
		{
			return(sum(sum));// calling back to find sum of digits again
		}
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number 1 ");
		int a = in.nextInt();
		System.out.println("Enter Number 2");
		int b = in.nextInt();
		Sum_of_Digits_Advanced obj = new Sum_of_Digits_Advanced();
		obj.divBy3(a, b);

	}

}
