package numberPrograms;

import java.util.*;

//Write a Java program to check whether a number is pallindrome or not
public class Pallindrome_Number {
	int n;
	int pallin=0;
	public void isPallindrome(int num)
	{
		n=num;
		while(n!=0)
		{
			pallin = (pallin*10)+(n%10);
			n=n/10;
		}
		if(num==pallin)
		{
			System.out.println(num+" is a Pallindrome Number.");
		}
		else
		{
			System.out.println(num+" is not a Pallindrome Number.");
		}
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number");
		int a = in.nextInt();
		Pallindrome_Number obj = new Pallindrome_Number();
		obj.isPallindrome(a);
	}
}
