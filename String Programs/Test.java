package stringShit;

import java.util.Scanner;

public class Test
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number");
		int a = in.nextInt();
		int n, arm=0;
		int m;
		n=a;
		while(n!=0)
		{
			m=n%10;
			arm = arm + (m*m*m);
			n=n/10;
		}
		if(a==arm)
			System.out.println("Is Armstrong");
		else
			System.out.println("Is not Armstrong");
			
	}
}