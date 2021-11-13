package numberPrograms;
// Write a Java program to print the odd and even values in an array
import java.util.*;
public class Odd_Even {
	public void isOddEven(int a[])
	{
		System.out.println("Odd Values are: ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
				System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Even Values are: ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Length of Array");
		int n = in.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Element "+(i+1));
			arr[i]=in.nextInt();
		}
		Odd_Even obj = new Odd_Even();
		obj.isOddEven(arr);
}
}
